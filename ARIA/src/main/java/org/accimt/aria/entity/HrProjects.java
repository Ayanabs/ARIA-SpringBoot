package org.accimt.aria.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "hr_projects")
public class HrProjects {
    @Id
    @Column(name = "serial_no")
    private Integer serialNo;

    @Column(name = "year")
    private Integer year;

    @Column(name = "div_code")
    private Integer divCode;

    @Column(name = "pt_code")
    private Integer ptCode;

    @Column(name = "description")
    private String description;

    @Column(name = "code")
    private String code;

    @Column(name = "pname")
    private String pname;

    @Column(name = "apcode")
    private String apcode;

    @Column(name = "startdate")
    private LocalDate startdate;

    @Column(name = "enddate")
    private LocalDate enddate;

    @Column(name = "ptype")
    private String ptype;

    @Column(name = "cname")
    private String cname;

    @Column(name = "confirm")
    private String confirm;

    @Column(name = "sk_code")
    private String skCode;

    @Column(name = "p_close")
    private String pClose;

}