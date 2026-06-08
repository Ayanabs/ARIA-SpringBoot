package org.accimt.aria.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "pr_change_history")
public class PrChangeHistory {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "serial_no")
    private Integer serialNo;

    @Column(name = "capital")
    private Double capital;

    @Column(name = "recurrent")
    private Double recurrent;

    @Column(name = "income")
    private Double income;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "date_of_change")
    private LocalDateTime dateOfChange;

    @Column(name = "new_ap_code")
    private String newApCode;

    @Column(name = "ap_code_year")
    private Integer apCodeYear;

    @Column(name = "edit_type")
    private String editType;

    @Column(name = "edit_user")
    private Integer editUser;

}