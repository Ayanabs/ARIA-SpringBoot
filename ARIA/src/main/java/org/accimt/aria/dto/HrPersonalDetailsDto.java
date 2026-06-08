package org.accimt.aria.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HrPersonalDetailsDto {
    private Integer empNo;
    private String title;
    private String surname;
    private String initials;
    private String nameDnbyIntl;
    private String nICNum;
    private String dOB;
    private String gender;
    private String prmntAdd1;
    private String prmntAdd2;
    private String prmntAdd3;
    private String cntctAdd1;
    private String cntctAdd2;
    private String cntctAdd3;
    private String officeCnNum;
    private String prsnlCnNum;
    private String email;
    private String fullname;
}
