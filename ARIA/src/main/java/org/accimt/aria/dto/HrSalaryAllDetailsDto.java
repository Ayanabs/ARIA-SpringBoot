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
public class HrSalaryAllDetailsDto {
    private Integer empNo;
    private Integer currentSalary;
    private Integer salaryAfterIncrement;
    private Integer incrementValue;
    private String salaryCode;
    private Integer grade;
    private Integer totalPayYears;
    private Integer remainingYears;
    private String link;
    private LocalDate paidDate;
    private Integer order;
}
