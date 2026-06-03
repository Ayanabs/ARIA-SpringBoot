package org.accimt.aria.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DivisionDto {
    private Integer divisioncode;
    private String division;
    private String shCode;
    private Integer hod;
    private Integer ddg;
    private Integer dg;

    private EmployeeDto headOfDivision;
    private EmployeeDto deputyDirectorGeneral;
    private EmployeeDto directorGeneral;
}
