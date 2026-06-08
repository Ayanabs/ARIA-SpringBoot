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
public class PrClosedDto {
    private Integer id;
    private Integer clId;
    private String pType;
    private String clReason;
    private LocalDate hdate;
    private String invoice;
    private LocalDate rdate;
    private LocalDate adate;
    private String cname;
    private String oreason;
    private String otherdetails;
}
