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
public class PositionsTblDto {
    private Integer empNo;
    private LocalDate promoDt;
    private Integer divisionCode;
    private Integer desigCode;
    private Integer categoryCode;
}
