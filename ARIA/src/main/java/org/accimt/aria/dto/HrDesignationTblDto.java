package org.accimt.aria.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HrDesignationTblDto {
    private Integer desigCode;
    private String designation;
    private Integer salaryCode;
    private Integer apCadre;
}
