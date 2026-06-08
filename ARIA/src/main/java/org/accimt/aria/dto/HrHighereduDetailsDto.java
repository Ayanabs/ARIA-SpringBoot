package org.accimt.aria.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HrHighereduDetailsDto {
    private Integer id;
    private Integer empNo;
    private Integer subEduType;
    private Integer higherEduLevel;
    private String description;
}
