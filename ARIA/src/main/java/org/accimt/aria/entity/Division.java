package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "division_tbl")
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "divisioncode")
    private Integer divisioncode;

    @Column(name = "division", length = 150)
    private String division;

    @Column(name = "sh_code", length = 5)
    private String shCode;

    @Column(name = "hod")
    private Integer hod;

    @Column(name = "ddg")
    private Integer ddg;

    @Column(name = "dg")
    private Integer dg;
}
