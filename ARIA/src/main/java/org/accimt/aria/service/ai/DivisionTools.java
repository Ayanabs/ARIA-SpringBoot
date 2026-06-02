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
        return divisionService.getAllDivisions();
    }

    @Tool("Fetches details of a specific division by its unique ID (maps to /api/divisions/{id})")
    public Object fetchDivisionById(@P("The unique numeric ID of the division") Integer id) {
        RoutingContext.addEndpoint("/api/divisions/" + id);
        return divisionService.getDivisionById(id);
    }
}
