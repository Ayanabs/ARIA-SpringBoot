package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "hr_q_ol")
public class HrQOl {
    @Id
    @Column(name = "hr_ol_qid")
    private Integer hrOlQid;

    @Column(name = "EmpNo")
    private String empNo;

    @Column(name = "OLIndex")
    private String oLIndex;

    @Column(name = "OLSubNo")
    private String oLSubNo;

    @Column(name = "OLSubGrade")
    private String oLSubGrade;

    @Column(name = "OLYear")
    private Integer oLYear;

}