package org.accimt.aria.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HrSalaryTblDto {
    private Integer salaryID;
    private String salaryCode;
    private Integer salaryGrade;
    private String salaryScale;
    private Integer salaryInitVal;
    private Integer salaryIncremntYrs;
    private Integer salaryIncremntAmnt;
}
