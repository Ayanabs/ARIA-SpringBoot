package org.accimt.aria.service.ai;

import dev.langchain4j.agent.tool.Tool;
import dev.langchain4j.agent.tool.P;
import org.accimt.aria.service.EmpTypeService;
import org.springframework.stereotype.Component;

@Component
public class EmpTypeTools {

    private final EmpTypeService empTypeService;

    public EmpTypeTools(EmpTypeService empTypeService) {
        this.empTypeService = empTypeService;
    }

    @Tool("Fetches details of all employee types from the database (maps to /api/employee-types)")
    public Object fetchAllEmployeeTypes() {
        RoutingContext.addEndpoint("/api/employee-types");
        Object result = empTypeService.getAllEmpTypes();
        RoutingContext.setLastResult(result);
        return result;
    }

    @Tool("Fetches details of a specific employee type by its unique ID (maps to /api/employee-types/{id})")
    public Object fetchEmployeeTypeById(@P("The unique numeric ID of the employee type") Integer id) {
        RoutingContext.addEndpoint("/api/employee-types/" + id);
        Object result = empTypeService.getEmpTypeById(id);
        RoutingContext.setLastResult(result);
        return result;
    }
}
