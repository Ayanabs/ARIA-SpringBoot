package org.accimt.aria.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PrChangeHistoryDto {
    private Integer id;
    private Integer serialNo;
    private Double capital;
    private Double recurrent;
    private Double income;
    private LocalDate endDate;
    private LocalDateTime dateOfChange;
    private String newApCode;
    private Integer apCodeYear;
    private String editType;
    private Integer editUser;
}
