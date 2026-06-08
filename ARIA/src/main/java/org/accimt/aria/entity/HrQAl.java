package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "hr_q_al")
public class HrQAl {
    @Id
    @Column(name = "hr_q_alid")
    private Integer hrQAlid;

    @Column(name = "EmpNo")
    private String empNo;

    @Column(name = "ALIndex")
    private String aLIndex;

    @Column(name = "ALSubNo")
    private String aLSubNo;

    @Column(name = "ALSubGrade")
    private String aLSubGrade;

    @Column(name = "ALYear")
    private Integer aLYear;

}