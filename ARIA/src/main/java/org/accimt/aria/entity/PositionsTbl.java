package org.accimt.aria.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "positions_tbl")
public class PositionsTbl {
    @Id
    @Column(name = "EmpNo")
    private Integer empNo;

    @Column(name = "Promo_Dt")
    private LocalDate promoDt;

    @Column(name = "DivisionCode")
    private Integer divisionCode;

    @Column(name = "DesigCode")
    private Integer desigCode;

    @Column(name = "CategoryCode")
    private Integer categoryCode;

}