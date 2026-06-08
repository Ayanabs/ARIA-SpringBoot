package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "hr_salary_scale")
public class HrSalaryScale {
    @Id
    @Column(name = "ID")
    private Integer iD;

    @Column(name = "SalaryCode")
    private String salaryCode;

    @Column(name = "Grade")
    private String grade;

    @Column(name = "SalaryScale")
    private String salaryScale;

}