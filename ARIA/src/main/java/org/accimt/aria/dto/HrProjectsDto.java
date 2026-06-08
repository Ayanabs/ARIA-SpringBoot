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
public class HrProjectsDto {
    private Integer serialNo;
    private Integer year;
    private Integer divCode;
    private Integer ptCode;
    private String description;
    private String code;
    private String pname;
    private String apcode;
    private LocalDate startdate;
    private LocalDate enddate;
    private String ptype;
    private String cname;
    private String confirm;
    private String skCode;
    private String pClose;
}
