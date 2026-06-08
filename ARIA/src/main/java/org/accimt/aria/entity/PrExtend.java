package org.accimt.aria.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "pr_extend")
public class PrExtend {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "ex_id")
    private Integer exId;

    @Column(name = "extended_date")
    private LocalDate extendedDate;

    @Column(name = "edate")
    private LocalDate edate;

}