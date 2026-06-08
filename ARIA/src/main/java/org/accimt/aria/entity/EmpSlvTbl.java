package org.accimt.aria.entity;

import jakarta.persistence.*;
import java.time.LocalTime;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "emp_slv_tbl")
public class EmpSlvTbl {
    @Id
    @Column(name = "Sleave_ID")
    private Integer sleaveId;

    @Column(name = "Emp_No")
    private Integer empNo;

    @Column(name = "From_Time")
    private LocalTime fromTime;

    @Column(name = "To_Time")
    private LocalTime toTime;

    @Column(name = "AttDtId")
    private Integer attDtId;

    @Column(name = "Slv_type")
    private String slvType;

    @Column(name = "color")
    private String color;

    @Column(name = "slv_comment")
    private String slvComment;

    @Column(name = "ShLeave_Type_ID")
    private Integer shLeaveTypeId;

}