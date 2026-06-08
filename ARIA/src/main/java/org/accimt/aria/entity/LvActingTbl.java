package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "lv_acting_tbl")
public class LvActingTbl {
    @Id
    @Column(name = "Lv_Act_ID")
    private Integer lvActId;

    @Column(name = "Emp_No")
    private Integer empNo;

    @Column(name = "Act_Emp_No")
    private Integer actEmpNo;

}