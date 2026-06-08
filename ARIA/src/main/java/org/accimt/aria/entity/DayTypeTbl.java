package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "day_type_tbl")
public class DayTypeTbl {
    @Id
    @Column(name = "DayTypeID")
    private Integer dayTypeID;

    @Column(name = "DayType")
    private String dayType;

}