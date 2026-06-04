package org.accimt.aria.service.ai;

import dev.langchain4j.agent.tool.Tool;
import dev.langchain4j.agent.tool.P;
import org.accimt.aria.service.DesignationService;
import org.springframework.stereotype.Component;

@Component
public class DesignationTools {

    private final DesignationService designationService;

    public DesignationTools(DesignationService designationService) {
        this.designationService = designationService;
    }

    @Tool("Fetches details of all designations from the database (maps to /api/designations)")
    public Object fetchAllDesignations() {
        RoutingContext.addEndpoint("/api/designations");
        Object result = designationService.getAllDesignations();
        RoutingContext.addResult(result);
        return result;
    }

    @Tool("Fetches details of a specific designation by its unique ID (maps to /api/designations/{id})")
    public Object fetchDesignationById(@P("The unique numeric ID of the designation") Object idVal) {
        String idStr = String.valueOf(idVal);
        RoutingContext.addEndpoint("/api/designations/" + idStr);
        String cleaned = idStr.replaceAll("[^0-9]", "");
        if (cleaned.isEmpty()) {
            throw new IllegalArgumentException("Invalid designation ID format: " + idStr);
        }
        Integer id = Integer.parseInt(cleaned);
        Object result = designationService.getDesignationById(id);
        RoutingContext.addResult(result);
        return result;
    }
}
