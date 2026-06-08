package org.accimt.aria.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.accimt.aria.dto.AgentQueryRequest;
import org.accimt.aria.dto.AgentQueryResponse;
import org.accimt.aria.service.AgentQueryService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;

import java.util.*;

@Slf4j
@Service
public class AgentQueryServiceImpl implements AgentQueryService {

    private final String agentServiceUrl;
    private final RestTemplate restTemplate = new RestTemplate();

    public AgentQueryServiceImpl(@Value("${agent.service.url}") String agentServiceUrl) {
        this.agentServiceUrl = agentServiceUrl;
    }

    @Override
    public List<String> getAvailableModels() {
        return Collections.singletonList("llama3.2:3b");
    }

    @Override
    public AgentQueryResponse executeQuery(AgentQueryRequest request) {
        long startTime = System.currentTimeMillis();
        try {
            log.info("Forwarding agent query for prompt: {} to URL: {}", request.getPrompt(), agentServiceUrl);
            AgentQueryResponse response = restTemplate.postForObject(agentServiceUrl, request, AgentQueryResponse.class);
            if (response != null) {
                response.setExecutionTimeMs(System.currentTimeMillis() - startTime);
                return response;
            } else {
                throw new RuntimeException("Received empty response from the agent service.");
            }
        } catch (Exception e) {
            log.error("Error executing agent query: ", e);
            return AgentQueryResponse.builder()
                    .error("Agent Execution Error: " + e.getMessage())
                    .executionTimeMs(System.currentTimeMillis() - startTime)
                    .build();
        }
    }
}
