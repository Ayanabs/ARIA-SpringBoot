package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "emp_lv_tbl_bkp")
public class EmpLvTblBkp {
    @Id
    @Column(name = "Leave_ID")
    private Integer leaveId;

    @Column(name = "Emp_No")
    private Integer empNo;

    @Column(name = "Leave_Type_ID")
    private Integer leaveTypeId;

    @Column(name = "No_of_Days")
    private Double noOfDays;

    @Column(name = "AttDtId")
    private Integer attDtId;

    @Column(name = "Applied_Leave_ID")
    private Integer appliedLeaveId;

    @Column(name = "Overseas_private")
    private Integer overseasPrivate;

}