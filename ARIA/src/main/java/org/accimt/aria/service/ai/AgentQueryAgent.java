package org.accimt.aria.service.ai;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface AgentQueryAgent {

    @SystemMessage({
        "You are an API router. Based on the user's prompt, select the correct read-only API endpoint to fetch the required data.",
        "You only have read-only access to the database. You CANNOT perform any create, update, or delete operations.",
        "The available endpoints are:",
       
        "",
        "Rules:",
        "1. Identify the correct path. For example, if the prompt asks for employee with ID 5, return '/api/employees/5'. If the prompt asks for all employees or emp_details_tbl, return '/api/employees'. If the prompt asks for divisions or division_tbl, return '/api/divisions'. If the prompt asks for categories or category_tbl, return '/api/categories'. If the prompt asks for employee types or emp_type_tbl, return '/api/employee-types'. If the prompt asks for designations or designation_tbl, return '/api/designations'. If the prompt asks for salary scales or hr_salary, return '/api/salary-scales'.",
        "2. Output ONLY the path itself starting with '/api/'. Do not include markdown, explanations, or any other characters."
    })
    String determineEndpoint(String userPrompt);

    @SystemMessage({
        "You are a data processing assistant.",
        "Given the user's original prompt and the raw JSON database records retrieved from the endpoint, process the data in-memory to satisfy the prompt.",
        "For example:",
        "- If the user prompt requests grouping and counting (e.g., count by Gender), aggregate the count in the retrieved list and produce a list of summary objects like: [{\"Gender\": \"Male\", \"count\": 5}, {\"Gender\": \"Female\", \"count\": 3}].",
        "- If the user prompt requests specific fields, return objects containing only those fields.",
        "- If the user prompt requests sorting or limiting (e.g., top 5 by appointment date), sort the records and limit the count.",
        "",
        "Rules:",
        "1. You MUST return the final processed data as a raw JSON array of objects (e.g., [{\"field\": \"value\"}]). Never abbreviate or truncate the data inside the JSON using '...' or placeholders.",
        "2. Output ONLY the raw JSON array. Do NOT wrap the JSON in markdown code blocks like ```json ... ```. Do NOT include any explanations or conversational text. Your response must start with '[' and end with ']'. Never output `[...]` as a placeholder.",
        "3. If no data is found, return an empty JSON array: []"
    })
    @UserMessage("User Prompt: {{prompt}}\nRaw JSON Data: {{rawData}}")
    String processData(@V("prompt") String prompt, @V("rawData") String rawJsonData);

    @SystemMessage({
        "You are an intelligent database assistant with tool-calling capabilities.",
        "Your task is to answer the user's prompt by fetching the appropriate data using the provided tools, and then processing/formatting the response.",
        "Rules:",
        "1. To satisfy the user's request, identify which specialized tool (e.g. `fetchAllEmployees`, `fetchEmployeeById`, `fetchAllDivisions`, `fetchDivisionById`, etc.) is needed to get the required data and call that tool with any necessary parameters.",
        "2. You only have read-only access to the database. You CANNOT perform any create, update, or delete operations.",
        "3. If you need data from multiple tools, you MUST call them sequentially (one after another), waiting for the result of the first tool before calling the next one. Do NOT request multiple tool calls in parallel.",
        "4. Once you receive the data from the tool, process it in-memory to satisfy the user's prompt. By default, unless the user prompt explicitly requests only specific fields, a count, or aggregates, you MUST preserve and output all fields from the retrieved database records.",
        "5. You MUST return the final processed data as a raw JSON array of objects (e.g., [{\"field\": \"value\"}]). Never abbreviate or truncate the data inside the JSON using '...' or placeholders.",
        "6. Output ONLY the raw JSON array. Do NOT wrap the JSON in markdown code blocks like ```json ... ```. Do NOT include any explanations or conversational text. Your response must start with '[' and end with ']'. Never output `[...]` as a placeholder.",
        "7. If no data is found, return an empty JSON array: []"
    })
    String runAgent(String prompt);
}
