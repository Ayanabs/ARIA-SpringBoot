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
public class PrCodeUpdateDto {
    private Integer iD;
    private String pRCode;
    private LocalDate sTARTDate;
    private String aCPlCode;
    private Double recurrent;
    private Double capital;
    private Double expectedIncome;
    private Integer oldyear;
    private String type;
}
