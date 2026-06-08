package org.accimt.aria.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmpLvTblBkpDto {
    private Integer leaveId;
    private Integer empNo;
    private Integer leaveTypeId;
    private Double noOfDays;
    private Integer attDtId;
    private Integer appliedLeaveId;
    private Integer overseasPrivate;
}
