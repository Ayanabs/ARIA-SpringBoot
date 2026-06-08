package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "pr_project_types")
public class PrProjectTypes {
    @Id
    @Column(name = "pt_code")
    private Integer ptCode;

    @Column(name = "pt_short_des")
    private String ptShortDes;

    @Column(name = "pt_description")
    private String ptDescription;

}