package org.accimt.aria.service;

import org.accimt.aria.dto.AgentQueryRequest;
import org.accimt.aria.dto.AgentQueryResponse;
import java.util.List;

public interface AgentQueryService {
    AgentQueryResponse executeQuery(AgentQueryRequest request);
    List<String> getAvailableModels();
}
