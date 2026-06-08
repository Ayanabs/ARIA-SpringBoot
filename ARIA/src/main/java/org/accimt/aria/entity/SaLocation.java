package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "sa_location")
public class SaLocation {
    @Id
    @Column(name = "locaton_id")
    private Integer locatonId;

    @Column(name = "building_id")
    private Integer buildingId;

    @Column(name = "division_id")
    private Integer divisionId;

    @Column(name = "locaton_info")
    private String locatonInfo;

    @Column(name = "short_form")
    private String shortForm;

}