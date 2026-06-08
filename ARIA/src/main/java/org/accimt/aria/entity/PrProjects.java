package org.accimt.aria.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "pr_projects")
public class PrProjects {
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

    @Column(name = "hod_confirm")
    private String hodConfirm;

    @Column(name = "hod_confirmed_date")
    private LocalDateTime hodConfirmedDate;

    @Column(name = "sk_code")
    private String skCode;

    @Column(name = "p_close")
    private String pClose;

    @Column(name = "p_close_user")
    private String pCloseUser;

    @Column(name = "p_close_reason")
    private String pCloseReason;

    @Column(name = "capital")
    private Double capital;

    @Column(name = "recurrent")
    private Double recurrent;

    @Column(name = "externalinput")
    private Double externalinput;

    @Column(name = "rdate")
    private LocalDate rdate;

    @Column(name = "expected_income")
    private Double expectedIncome;

    @Column(name = "user")
    private String user;

    @Column(name = "confirmed_date")
    private LocalDateTime confirmedDate;

    @Column(name = "closed_date")
    private LocalDate closedDate;

    @Column(name = "extended")
    private String extended;

    @Column(name = "extended_date")
    private LocalDate extendedDate;

}