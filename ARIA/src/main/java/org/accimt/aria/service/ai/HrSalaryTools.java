package org.accimt.aria.service.ai;

import dev.langchain4j.agent.tool.Tool;
import dev.langchain4j.agent.tool.P;
import org.accimt.aria.service.HrSalaryService;
import org.springframework.stereotype.Component;

@Component
public class HrSalaryTools {

    private final HrSalaryService hrSalaryService;

    public HrSalaryTools(HrSalaryService hrSalaryService) {
        this.hrSalaryService = hrSalaryService;
    }

    @Tool("Fetches details of all salary scales from the database (maps to /api/salary-scales)")
    public Object fetchAllSalaryScales() {
        RoutingContext.addEndpoint("/api/salary-scales");
        Object result = hrSalaryService.getAllHrSalaries();
        RoutingContext.addResult(result);
        return result;
    }

    @Tool("Fetches details of a specific salary scale by its unique salary code (maps to /api/salary-scales/{id})")
    public Object fetchSalaryScaleByCode(@P("The unique alphanumeric code of the salary scale") String code) {
        RoutingContext.addEndpoint("/api/salary-scales/" + code);
        Object result = hrSalaryService.getHrSalaryById(code);
        RoutingContext.addResult(result);
        return result;
    }
}
