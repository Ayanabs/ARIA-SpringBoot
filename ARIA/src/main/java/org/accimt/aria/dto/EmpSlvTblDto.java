package org.accimt.aria.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmpSlvTblDto {
    private Integer sleaveId;
    private Integer empNo;
    private LocalTime fromTime;
    private LocalTime toTime;
    private Integer attDtId;
    private String slvType;
    private String color;
    private String slvComment;
    private Integer shLeaveTypeId;
}
