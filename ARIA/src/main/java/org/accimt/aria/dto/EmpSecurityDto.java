package org.accimt.aria.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmpSecurityDto {
    private Integer empId;
    private String name;
    private String idNo;
    private String rank;
    private Integer status;
}
