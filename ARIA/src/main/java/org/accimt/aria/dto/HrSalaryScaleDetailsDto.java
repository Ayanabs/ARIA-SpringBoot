package org.accimt.aria.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HrSalaryScaleDetailsDto {
    private Integer id;
    private String salaryCode;
    private Integer grade;
    private Integer incrementYears;
    private Integer amount;
    private Integer order;
}
