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
public class HrTempSalaryInfoDto {
    private Integer empNo;
    private Integer order;
    private LocalDate preparedDate;
    private String nameFull;
    private String designation;
    private String salScale;
    private String presentSal;
    private LocalDate incDate;
    private String incValue;
    private String finalSal;
    private String deputyDeneral;
    private String cc;
}
