package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "hr_division_tbl")
public class HrDivisionTbl {
    @Id
    @Column(name = "DivisionCode")
    private Integer divisionCode;

    @Column(name = "Division")
    private String division;

    @Column(name = "sh_code")
    private String shCode;

    @Column(name = "category")
    private String category;

}