package org.accimt.aria.service.ai;

import dev.langchain4j.agent.tool.Tool;
import dev.langchain4j.agent.tool.P;
import org.accimt.aria.service.EmployeeService;
import org.springframework.stereotype.Component;

@Component
public class EmployeeTools {

    private final EmployeeService employeeService;

    public EmployeeTools(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Tool("Fetches details of all employees from the database (maps to /api/employees)")
    public Object fetchAllEmployees() {
        RoutingContext.addEndpoint("/api/employees");
        return employeeService.getAllEmployees();
    }

    @Tool("Fetches details of a specific employee by their unique ID (maps to /api/employees/{id})")
    public Object fetchEmployeeById(@P("The unique numeric ID of the employee") Long id) {
        RoutingContext.addEndpoint("/api/employees/" + id);
        return employeeService.getEmployeeById(id);
    }
   
}
