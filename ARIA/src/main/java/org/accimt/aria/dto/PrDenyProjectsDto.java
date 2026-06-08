package org.accimt.aria.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PrDenyProjectsDto {
    private Integer id;
    private String pCode;
    private String reason;
    private LocalDateTime dateTime;
    private Integer userId;
    private String userType;
}
