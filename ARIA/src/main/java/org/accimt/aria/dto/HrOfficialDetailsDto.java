package org.accimt.aria.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HrOfficialDetailsDto {
    private Integer empNo;
    private LocalDate dateofAppoinment;
    private Integer divisionCode;
    private String category;
    private Integer desigCode;
    private LocalDate promotion;
    private String probationPeriod;
    private LocalDate incrementDate;
    private LocalDate resignation;
    private String empActive;
}
