package org.accimt.aria.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HrSalaryDetailsDto {
    private Integer id;
    private String salaryCode;
    private String grade;
    private Integer initialValue;
    private Integer initialStep;
}
