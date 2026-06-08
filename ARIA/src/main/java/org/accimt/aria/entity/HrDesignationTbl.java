package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "hr_designation_tbl")
public class HrDesignationTbl {
    @Id
    @Column(name = "DesigCode")
    private Integer desigCode;

    @Column(name = "Designation")
    private String designation;

    @Column(name = "SalaryCode")
    private Integer salaryCode;

    @Column(name = "ApCadre")
    private Integer apCadre;

}