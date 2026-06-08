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
public class PrPastEndDto {
    private Integer id;
    private String prCode;
    private LocalDate endDate;
    private Double recurrent;
    private Double capital;
    private Double expectedIncome;
}
