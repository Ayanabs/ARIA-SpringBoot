package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "designation_tbl")
public class Designation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "desigcode")
    private Integer desigcode;

    @Column(name = "designation", length = 150)
    private String designation;

    @Column(name = "mainid")
    private Integer mainid;
}
