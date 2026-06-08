package org.accimt.aria.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PrProjectsDto {
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
    private String hodConfirm;
    private LocalDateTime hodConfirmedDate;
    private String skCode;
    private String pClose;
    private String pCloseUser;
    private String pCloseReason;
    private Double capital;
    private Double recurrent;
    private Double externalinput;
    private LocalDate rdate;
    private Double expectedIncome;
    private String user;
    private LocalDateTime confirmedDate;
    private LocalDate closedDate;
    private String extended;
    private LocalDate extendedDate;
}
