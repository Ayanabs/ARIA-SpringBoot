package org.accimt.aria.controller;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.AgentQueryRequest;
import org.accimt.aria.dto.AgentQueryResponse;
import org.accimt.aria.service.AgentQueryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/agent-query")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class AgentQueryController {

    private final AgentQueryService agentQueryService;

    @PostMapping
    public ResponseEntity<AgentQueryResponse> executeQuery(@RequestBody AgentQueryRequest request) {
        if (request.getPrompt() == null || request.getPrompt().trim().isEmpty()) {
            return ResponseEntity.badRequest().body(
                    AgentQueryResponse.builder()
                            .error("Prompt cannot be empty.")
                            .build()
            );
        }
        return ResponseEntity.ok(agentQueryService.executeQuery(request));
    }

    @GetMapping("/models")
    public ResponseEntity<List<String>> getModels() {
        return ResponseEntity.ok(agentQueryService.getAvailableModels());
    }
}
