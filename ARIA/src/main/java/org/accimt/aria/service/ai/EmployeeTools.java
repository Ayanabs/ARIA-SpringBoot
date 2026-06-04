package org.accimt.aria.service.ai;

import dev.langchain4j.agent.tool.Tool;
import dev.langchain4j.agent.tool.P;
import org.accimt.aria.dto.EmployeeDto;
import org.accimt.aria.service.EmployeeService;
import org.springframework.stereotype.Component;
import java.time.LocalDate;

@Component
public class EmployeeTools {

    private final EmployeeService employeeService;

    public EmployeeTools(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Tool("Fetches details of all employees from the database (maps to /api/employees)")
    public Object fetchAllEmployees() {
        RoutingContext.addEndpoint("/api/employees");
        Object result = employeeService.getAllEmployees();
        RoutingContext.addResult(result);
        return result;
    }

    @Tool("Fetches details of a specific employee by their unique ID (maps to /api/employees/{id})")
    public Object fetchEmployeeById(@P("The unique numeric ID of the employee") Object idVal) {
        String idStr = String.valueOf(idVal);
        RoutingContext.addEndpoint("/api/employees/" + idStr);
        String cleaned = idStr.replaceAll("[^0-9]", "");
        if (cleaned.isEmpty()) {
            throw new IllegalArgumentException("Invalid employee ID format: " + idStr);
        }
        Long id = Long.parseLong(cleaned);
        Object result = employeeService.getEmployeeById(id);
        RoutingContext.addResult(result);
        return result;
    }

    @Tool("Fetches employee details by their email address (maps to /api/employees/email/{email})")
    public Object fetchEmployeeByEmail(@P("The email address of the employee") String email) {
        RoutingContext.addEndpoint("/api/employees/email/" + email);
        Object result = employeeService.getEmployeeByEmail(email);
        RoutingContext.addResult(result);
        return result;
    }

    @Tool("Fetches employee details by their employee number (maps to /api/employees/empno/{empno})")
    public Object fetchEmployeeByEmpno(@P("The numeric employee number") Object empnoVal) {
        String empnoStr = String.valueOf(empnoVal);
        RoutingContext.addEndpoint("/api/employees/empno/" + empnoStr);
        String cleaned = empnoStr.replaceAll("[^0-9]", "");
        if (cleaned.isEmpty()) {
            throw new IllegalArgumentException("Invalid employee number format: " + empnoStr);
        }
        Integer empno = Integer.parseInt(cleaned);
        Object result = employeeService.getEmployeeByEmpno(empno);
        RoutingContext.addResult(result);
        return result;
    }

    @Tool("Fetches employee details by their National Identity Card (NIC) number (maps to /api/employees/nic/{nicnum})")
    public Object fetchEmployeeByNicnum(@P("The NIC card number") String nicnum) {
        RoutingContext.addEndpoint("/api/employees/nic/" + nicnum);
        Object result = employeeService.getEmployeeByNicnum(nicnum);
        RoutingContext.addResult(result);
        return result;
    }

    @Tool("Fetches a list of employees matching a phone or mobile number (maps to /api/employees/phone/{phone})")
    public Object fetchEmployeesByPhone(@P("The phone or mobile number") String phone) {
        RoutingContext.addEndpoint("/api/employees/phone/" + phone);
        Object result = employeeService.getEmployeesByPhone(phone);
        RoutingContext.addResult(result);
        return result;
    }
}
