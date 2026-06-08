package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "hr_salary_tbl")
public class HrSalaryTbl {
    @Id
    @Column(name = "SalaryID")
    private Integer salaryID;

    @Column(name = "SalaryCode")
    private String salaryCode;

    @Column(name = "SalaryGrade")
    private Integer salaryGrade;

    @Column(name = "SalaryScale")
    private String salaryScale;

    @Column(name = "SalaryInitVal")
    private Integer salaryInitVal;

    @Column(name = "SalaryIncremntYrs")
    private Integer salaryIncremntYrs;

    @Column(name = "SalaryIncremntAmnt")
    private Integer salaryIncremntAmnt;

}