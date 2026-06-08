package org.accimt.aria.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "hr_project_details")
public class HrProjectDetails {
    @Id
    @Column(name = "serial_no")
    private Integer serialNo;

    @Column(name = "pname")
    private String pname;

    @Column(name = "apnumber")
    private Integer apnumber;

    @Column(name = "startdate")
    private LocalDate startdate;

    @Column(name = "enddate")
    private LocalDate enddate;

    @Column(name = "ptype")
    private String ptype;

    @Column(name = "cname")
    private String cname;

}