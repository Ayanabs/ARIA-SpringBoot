package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "div_budg_tbl")
public class DivBudgTbl {
    @Id
    @Column(name = "divb_code")
    private Integer divbCode;

    @Column(name = "div_code")
    private Integer divCode;

    @Column(name = "budg_code")
    private String budgCode;

    @Column(name = "budg_year")
    private String budgYear;

    @Column(name = "user_descrip")
    private String userDescrip;

    @Column(name = "req_amount")
    private Double reqAmount;

    @Column(name = "appr_amount")
    private Double apprAmount;

    @Column(name = "req_confirm")
    private String reqConfirm;

    @Column(name = "app_confirm")
    private String appConfirm;

    @Column(name = "the_amount")
    private Double theAmount;

}