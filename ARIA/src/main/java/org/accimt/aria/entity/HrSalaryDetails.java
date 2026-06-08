package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "hr_salary_details")
public class HrSalaryDetails {
    @Id
    @Column(name = "Id")
    private Integer id;

    @Column(name = "SalaryCode")
    private String salaryCode;

    @Column(name = "Grade")
    private String grade;

    @Column(name = "InitialValue")
    private Integer initialValue;

    @Column(name = "InitialStep")
    private Integer initialStep;

}