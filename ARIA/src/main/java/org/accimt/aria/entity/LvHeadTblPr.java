package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "lv_head_tbl_pr")
public class LvHeadTblPr {
    @Id
    @Column(name = "Lv_Hod_ID")
    private Integer lvHodId;

    @Column(name = "Emp_No")
    private Integer empNo;

    @Column(name = "Hod_Emp_No")
    private Integer hodEmpNo;

}