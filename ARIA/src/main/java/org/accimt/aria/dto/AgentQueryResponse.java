package org.accimt.aria.dto;

import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AgentQueryResponse {
    private String sql;
    private List<Map<String, Object>> results;
    private List<EndpointResultGroup> endpointResults;
    private String error;
    private Long executionTimeMs;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class EndpointResultGroup {
        private String endpoint;
        private List<Map<String, Object>> records;
    }
}
