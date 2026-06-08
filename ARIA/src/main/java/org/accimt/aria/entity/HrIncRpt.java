package org.accimt.aria.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "hr_inc_rpt")
public class HrIncRpt {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "designation")
    private Integer designation;

    @Column(name = "salary_scale")
    private String salaryScale;

    @Column(name = "present_salary_point")
    private String presentSalaryPoint;

    @Column(name = "inc_date")
    private LocalDate incDate;

    @Column(name = "inc_value")
    private Integer incValue;

    @Column(name = "basic_salary")
    private String basicSalary;

    @Column(name = "rec_punsh")
    private String recPunsh;

    @Column(name = "pass_exam")
    private String passExam;

    @Column(name = "promotion")
    private String promotion;

    @Column(name = "appoinment")
    private String appoinment;

    @Column(name = "emp_qualified")
    private String empQualified;

}