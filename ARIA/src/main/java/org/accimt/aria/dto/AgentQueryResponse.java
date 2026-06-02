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
    private String error;
    private Long executionTimeMs;
}
