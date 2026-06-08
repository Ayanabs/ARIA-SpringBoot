package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "main_sub_division")
public class MainSubDivision {
    @Id
    @Column(name = "div_id")
    private Integer divId;

    @Column(name = "main_div_code")
    private String mainDivCode;

    @Column(name = "child_div_code")
    private Integer childDivCode;

}