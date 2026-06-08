package org.accimt.aria.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "pr_past_end")
public class PrPastEnd {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "pr_code")
    private String prCode;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "recurrent")
    private Double recurrent;

    @Column(name = "capital")
    private Double capital;

    @Column(name = "expected_income")
    private Double expectedIncome;

}