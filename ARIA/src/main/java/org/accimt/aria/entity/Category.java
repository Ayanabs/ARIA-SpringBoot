package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalTime;

@Entity
@Setter
@Getter
@Table(name = "category_tbl")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categorycode")
    private Integer categorycode;

    @Column(name = "category", length = 100)
    private String category;

    @Column(name = "intime")
    private LocalTime intime;

    @Column(name = "outtimeh")
    private Integer outtimeh;

    @Column(name = "outtimem")
    private Integer outtimem;

    @Column(name = "adjesttime")
    private LocalTime adjesttime;

    @Column(name = "latetime")
    private LocalTime latetime;

    @Column(name = "sp_latetime")
    private LocalTime spLatetime;
}
