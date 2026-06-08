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
public class HrIncRptDto {
    private Integer id;
    private String name;
    private Integer designation;
    private String salaryScale;
    private String presentSalaryPoint;
    private LocalDate incDate;
    private Integer incValue;
    private String basicSalary;
    private String recPunsh;
    private String passExam;
    private String promotion;
    private String appoinment;
    private String empQualified;
}
