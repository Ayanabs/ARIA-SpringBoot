package org.accimt.aria.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "pr_code_update")
public class PrCodeUpdate {
    @Id
    @Column(name = "ID")
    private Integer iD;

    @Column(name = "PR_CODE")
    private String pRCode;

    @Column(name = "START_DATE")
    private LocalDate sTARTDate;

    @Column(name = "AC_PL_CODE")
    private String aCPlCode;

    @Column(name = "recurrent")
    private Double recurrent;

    @Column(name = "capital")
    private Double capital;

    @Column(name = "expected_income")
    private Double expectedIncome;

    @Column(name = "oldyear")
    private Integer oldyear;

    @Column(name = "type")
    private String type;

}