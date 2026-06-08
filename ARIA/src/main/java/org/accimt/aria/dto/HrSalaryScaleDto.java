package org.accimt.aria.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HrSalaryScaleDto {
    private Integer iD;
    private String salaryCode;
    private String grade;
    private String salaryScale;
}
