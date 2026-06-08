package org.accimt.aria.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "lv_dts_tbl")
public class LvDtsTbl {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "Leave_ID")
    private Integer leaveId;

    @Column(name = "Leave_Date")
    private LocalDate leaveDate;

    @Column(name = "No_of_Days")
    private Double noOfDays;

}