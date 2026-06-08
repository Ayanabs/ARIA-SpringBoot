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
public class HrProjectDetailsDto {
    private Integer serialNo;
    private String pname;
    private Integer apnumber;
    private LocalDate startdate;
    private LocalDate enddate;
    private String ptype;
    private String cname;
}
