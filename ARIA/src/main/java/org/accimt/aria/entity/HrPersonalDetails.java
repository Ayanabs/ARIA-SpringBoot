package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "hr_personal_details")
public class HrPersonalDetails {
    @Id
    @Column(name = "EmpNo")
    private Integer empNo;

    @Column(name = "Title")
    private String title;

    @Column(name = "Surname")
    private String surname;

    @Column(name = "Initials")
    private String initials;

    @Column(name = "NameDnbyIntl")
    private String nameDnbyIntl;

    @Column(name = "NICNum")
    private String nICNum;

    @Column(name = "DOB")
    private String dOB;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "PrmntAdd1")
    private String prmntAdd1;

    @Column(name = "PrmntAdd2")
    private String prmntAdd2;

    @Column(name = "PrmntAdd3")
    private String prmntAdd3;

    @Column(name = "CntctAdd1")
    private String cntctAdd1;

    @Column(name = "CntctAdd2")
    private String cntctAdd2;

    @Column(name = "CntctAdd3")
    private String cntctAdd3;

    @Column(name = "OfficeCnNum")
    private String officeCnNum;

    @Column(name = "PrsnlCnNum")
    private String prsnlCnNum;

    @Column(name = "Email")
    private String email;

    @Column(name = "Fullname")
    private String fullname;

}