package org.accimt.aria.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "hr_official_details")
public class HrOfficialDetails {
    @Id
    @Column(name = "EmpNo")
    private Integer empNo;

    @Column(name = "DateofAppoinment")
    private LocalDate dateofAppoinment;

    @Column(name = "DivisionCode")
    private Integer divisionCode;

    @Column(name = "Category")
    private String category;

    @Column(name = "DesigCode")
    private Integer desigCode;

    @Column(name = "Promotion")
    private LocalDate promotion;

    @Column(name = "ProbationPeriod")
    private String probationPeriod;

    @Column(name = "IncrementDate")
    private LocalDate incrementDate;

    @Column(name = "Resignation")
    private LocalDate resignation;

    @Column(name = "emp_active")
    private String empActive;

}