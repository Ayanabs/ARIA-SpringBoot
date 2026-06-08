package org.accimt.aria.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HrQHieduDto {
    private String empNo;
    private String hiEduDiploma;
    private String hiEduDegree;
    private String hiEduExp;
    private String hiEduCertificate;
    private Integer id;
    private String hiEduPhD;
    private String hiEduMasters;
    private String hiEduProfeQli;
}
