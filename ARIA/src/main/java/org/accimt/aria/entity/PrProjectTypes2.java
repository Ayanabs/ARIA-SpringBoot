package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "pr_project_types2")
public class PrProjectTypes2 {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "pro_type")
    private String proType;

}