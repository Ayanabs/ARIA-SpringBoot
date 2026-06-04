package org.accimt.aria.service.ai;

import dev.langchain4j.agent.tool.Tool;
import dev.langchain4j.agent.tool.P;
import org.accimt.aria.service.DivisionService;
import org.springframework.stereotype.Component;

@Component
public class DivisionTools {

    private final DivisionService divisionService;

    public DivisionTools(DivisionService divisionService) {
        this.divisionService = divisionService;
    }

    @Tool("Fetches details of all divisions from the database (maps to /api/divisions)")
    public Object fetchAllDivisions() {
        RoutingContext.addEndpoint("/api/divisions");
        Object result = divisionService.getAllDivisions();
        RoutingContext.addResult(result);
        return result;
    }

    @Tool("Fetches details of a specific division by its unique ID (maps to /api/divisions/{id})")
    public Object fetchDivisionById(@P("The unique numeric ID of the division") Object idVal) {
        String idStr = String.valueOf(idVal);
        RoutingContext.addEndpoint("/api/divisions/" + idStr);
        String cleaned = idStr.replaceAll("[^0-9]", "");
        if (cleaned.isEmpty()) {
            throw new IllegalArgumentException("Invalid division ID format: " + idStr);
        }
        Integer id = Integer.parseInt(cleaned);
        Object result = divisionService.getDivisionById(id);
        RoutingContext.addResult(result);
        return result;
    }
}
