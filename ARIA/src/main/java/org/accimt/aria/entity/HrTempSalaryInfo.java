package org.accimt.aria.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "hr_temp_salary_info")
public class HrTempSalaryInfo {
    @Id
    @Column(name = "EmpNo")
    private Integer empNo;

    @Column(name = "Order")
    private Integer order;

    @Column(name = "PreparedDate")
    private LocalDate preparedDate;

    @Column(name = "NameFull")
    private String nameFull;

    @Column(name = "Designation")
    private String designation;

    @Column(name = "SalScale")
    private String salScale;

    @Column(name = "PresentSal")
    private String presentSal;

    @Column(name = "IncDate")
    private LocalDate incDate;

    @Column(name = "IncValue")
    private String incValue;

    @Column(name = "FinalSal")
    private String finalSal;

    @Column(name = "DeputyDeneral")
    private String deputyDeneral;

    @Column(name = "cc")
    private String cc;

}