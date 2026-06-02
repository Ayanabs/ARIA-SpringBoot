package org.accimt.aria.dto;

import lombok.Data;

@Data
public class AgentQueryRequest {
    private String prompt;
    private String model;
}
