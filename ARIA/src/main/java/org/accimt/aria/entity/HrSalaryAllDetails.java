package org.accimt.aria.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "hr_salary_all_details")
public class HrSalaryAllDetails {
    @Id
    @Column(name = "EmpNo")
    private Integer empNo;

    @Column(name = "CurrentSalary")
    private Integer currentSalary;

    @Column(name = "SalaryAfterIncrement")
    private Integer salaryAfterIncrement;

    @Column(name = "IncrementValue")
    private Integer incrementValue;

    @Column(name = "SalaryCode")
    private String salaryCode;

    @Column(name = "Grade")
    private Integer grade;

    @Column(name = "TotalPayYears")
    private Integer totalPayYears;

    @Column(name = "RemainingYears")
    private Integer remainingYears;

    @Column(name = "Link")
    private String link;

    @Column(name = "PaidDate")
    private LocalDate paidDate;

    @Column(name = "Order")
    private Integer order;

}