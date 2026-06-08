package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "hr_desig_cadre")
public class HrDesigCadre {
    @Id
    @Column(name = "DesigCode")
    private Integer desigCode;

    @Column(name = "appcp_t")
    private Integer appcpT;

    @Column(name = "appcp_a")
    private Integer appcpA;

    @Column(name = "extcp_t")
    private Integer extcpT;

    @Column(name = "extcp_a")
    private Integer extcpA;

}