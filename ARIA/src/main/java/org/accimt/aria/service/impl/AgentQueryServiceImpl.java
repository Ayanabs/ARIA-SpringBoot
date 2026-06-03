package org.accimt.aria.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.accimt.aria.dto.AgentQueryRequest;
import org.accimt.aria.dto.AgentQueryResponse;
import org.accimt.aria.service.AgentQueryService;
import org.accimt.aria.service.EmployeeService;
import org.accimt.aria.service.DivisionService;
import org.accimt.aria.service.CategoryService;
import org.accimt.aria.service.EmpTypeService;
import org.accimt.aria.service.DesignationService;
import org.accimt.aria.service.HrSalaryService;
import org.accimt.aria.service.ai.AgentQueryAgent;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.*;

@Slf4j
@Service
public class AgentQueryServiceImpl implements AgentQueryService {

    private final AgentQueryAgent agentQueryAgent;
    private final EmployeeService employeeService;
    private final DivisionService divisionService;
    private final CategoryService categoryService;
    private final EmpTypeService empTypeService;
    private final DesignationService designationService;
    private final HrSalaryService hrSalaryService;
    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public AgentQueryServiceImpl(AgentQueryAgent agentQueryAgent, EmployeeService employeeService, DivisionService divisionService, CategoryService categoryService, EmpTypeService empTypeService, DesignationService designationService, HrSalaryService hrSalaryService) {
        this.agentQueryAgent = agentQueryAgent;
        this.employeeService = employeeService;
        this.divisionService = divisionService;
        this.categoryService = categoryService;
        this.empTypeService = empTypeService;
        this.designationService = designationService;
        this.hrSalaryService = hrSalaryService;
    }

    @Override
    public List<String> getAvailableModels() {
        return Collections.singletonList("llama3.1");
    }

    @Override
    public AgentQueryResponse executeQuery(AgentQueryRequest request) {
        String prompt = request.getPrompt();
        long startTime = System.currentTimeMillis();

        try {
            log.info("Running agent query for prompt: {}", prompt);
            
            // Clear previous routing status
            org.accimt.aria.service.ai.RoutingContext.clear();

            // Run agent query (LLM decides which tool to call, fetches data, and formats the output in one run)
            String processedJson = agentQueryAgent.runAgent(prompt);
            log.info("Agent processed response: {}", processedJson);

            // Retrieve all endpoints that were called by the LLM tool
            List<String> endpoints = org.accimt.aria.service.ai.RoutingContext.getCalledEndpoints();
            String endpointStr = endpoints.isEmpty() ? "None" : String.join(", ", endpoints);
            log.info("Tool called endpoints: {}", endpointStr);

            List<Map<String, Object>> queryResults;
            Object rawResult = org.accimt.aria.service.ai.RoutingContext.getLastResult();
            if (rawResult != null) {
                log.info("Directly using raw result from tool call of class: {}", rawResult.getClass().getName());
                if (rawResult instanceof Collection) {
                    queryResults = objectMapper.convertValue(rawResult, new TypeReference<List<Map<String, Object>>>() {});
                } else {
                    Map<String, Object> map = objectMapper.convertValue(rawResult, new TypeReference<Map<String, Object>>() {});
                    queryResults = Collections.singletonList(map);
                }
            } else {
                String cleanedJson = cleanJson(processedJson);
                try {
                    queryResults = objectMapper.readValue(
                            cleanedJson, 
                            new TypeReference<List<Map<String, Object>>>() {}
                    );
                } catch (Exception parseException) {
                    log.warn("Failed to parse agent JSON response: {}. Error: {}", cleanedJson, parseException.getMessage());
                    // Fallback: check if it's an empty/placeholder response
                    if (cleanedJson.equals("[]") || cleanedJson.matches("\\[\\s*\\.*\\s*\\]")) {
                        queryResults = new ArrayList<>();
                    } else {
                        throw new RuntimeException("The agent returned an invalid JSON response. Please refine your query.");
                    }
                }
            }
            long executionTime = System.currentTimeMillis() - startTime;

            return AgentQueryResponse.builder()
                    .sql("Agent routed request to API endpoint via Tool Call: " + endpointStr)
                    .results(queryResults)
                    .executionTimeMs(executionTime)
                    .build();

        } catch (Exception e) {
            log.error("Error executing agent query: ", e);
            return AgentQueryResponse.builder()
                    .error("Agent Execution Error: " + e.getMessage())
                    .executionTimeMs(System.currentTimeMillis() - startTime)
                    .build();
        }
    }

    private Object fetchDataFromEndpoint(String endpoint) {
        if (endpoint == null) return null;
        String path = endpoint.trim().toLowerCase();
        
        // Normalize path
        if (path.contains("/api/")) {
            path = path.substring(path.indexOf("/api/"));
        }

        if (path.startsWith("/api/employees")) {
            if (path.equals("/api/employees") || path.equals("/api/employees/")) {
                return employeeService.getAllEmployees();
            } else {
                try {
                    String idStr = path.replaceAll("[^0-9]", "");
                    if (!idStr.isEmpty()) {
                        return employeeService.getEmployeeById(Long.parseLong(idStr));
                    }
                } catch (Exception e) {
                    log.error("Error parsing employee ID from path: {}", path, e);
                }
                return employeeService.getAllEmployees();
            }
        }

        if (path.startsWith("/api/divisions")) {
            if (path.equals("/api/divisions") || path.equals("/api/divisions/")) {
                return divisionService.getAllDivisions();
            } else {
                try {
                    String idStr = path.replaceAll("[^0-9]", "");
                    if (!idStr.isEmpty()) {
                        return divisionService.getDivisionById(Integer.parseInt(idStr));
                    }
                } catch (Exception e) {
                    log.error("Error parsing division ID from path: {}", path, e);
                }
                return divisionService.getAllDivisions();
            }
        }

        if (path.startsWith("/api/categories")) {
            if (path.equals("/api/categories") || path.equals("/api/categories/")) {
                return categoryService.getAllCategories();
            } else {
                try {
                    String idStr = path.replaceAll("[^0-9]", "");
                    if (!idStr.isEmpty()) {
                        return categoryService.getCategoryById(Integer.parseInt(idStr));
                    }
                } catch (Exception e) {
                    log.error("Error parsing category ID from path: {}", path, e);
                }
                return categoryService.getAllCategories();
            }
        }

        if (path.startsWith("/api/employee-types")) {
            if (path.equals("/api/employee-types") || path.equals("/api/employee-types/")) {
                return empTypeService.getAllEmpTypes();
            } else {
                try {
                    String idStr = path.replaceAll("[^0-9]", "");
                    if (!idStr.isEmpty()) {
                        return empTypeService.getEmpTypeById(Integer.parseInt(idStr));
                    }
                } catch (Exception e) {
                    log.error("Error parsing employee type ID from path: {}", path, e);
                }
                return empTypeService.getAllEmpTypes();
            }
        }

        if (path.startsWith("/api/designations")) {
            if (path.equals("/api/designations") || path.equals("/api/designations/")) {
                return designationService.getAllDesignations();
            } else {
                try {
                    String idStr = path.replaceAll("[^0-9]", "");
                    if (!idStr.isEmpty()) {
                        return designationService.getDesignationById(Integer.parseInt(idStr));
                    }
                } catch (Exception e) {
                    log.error("Error parsing designation ID from path: {}", path, e);
                }
                return designationService.getAllDesignations();
            }
        }

        if (path.startsWith("/api/salary-scales")) {
            if (path.equals("/api/salary-scales") || path.equals("/api/salary-scales/")) {
                return hrSalaryService.getAllHrSalaries();
            } else {
                try {
                    // SalaryCode is a String, so we parse the path segment
                    String code = path.substring(path.lastIndexOf('/') + 1);
                    if (!code.isEmpty()) {
                        return hrSalaryService.getHrSalaryById(code);
                    }
                } catch (Exception e) {
                    log.error("Error parsing salary code from path: {}", path, e);
                }
                return hrSalaryService.getAllHrSalaries();
            }
        }
        
        return null;
    }

    private String cleanJson(String json) {
        if (json == null) return "[]";
        String cleaned = json.trim();
        
        if (cleaned.startsWith("```")) {
            cleaned = cleaned.substring(3).trim();
            if (cleaned.toLowerCase().startsWith("json")) {
                cleaned = cleaned.substring(4).trim();
            }
        }
        
        if (cleaned.endsWith("```")) {
            cleaned = cleaned.substring(0, cleaned.length() - 3).trim();
        }
        
        cleaned = cleaned.trim();
        if (!cleaned.startsWith("[")) {
            int startIndex = cleaned.indexOf('[');
            int endIndex = cleaned.lastIndexOf(']');
            if (startIndex >= 0 && endIndex > startIndex) {
                cleaned = cleaned.substring(startIndex, endIndex + 1);
            } else {
                cleaned = "[]";
            }
        }
        return cleaned;
    }
}
