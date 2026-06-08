package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "hr_salary_scale_details")
public class HrSalaryScaleDetails {
    @Id
    @Column(name = "Id")
    private Integer id;

    @Column(name = "SalaryCode")
    private String salaryCode;

    @Column(name = "Grade")
    private Integer grade;

    @Column(name = "IncrementYears")
    private Integer incrementYears;

    @Column(name = "Amount")
    private Integer amount;

    @Column(name = "Order")
    private Integer order;

}