package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "pr_project_apcode")
public class PrProjectApcode {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "pr_code")
    private String prCode;

    @Column(name = "year")
    private String year;

    @Column(name = "ap_code")
    private String apCode;

}