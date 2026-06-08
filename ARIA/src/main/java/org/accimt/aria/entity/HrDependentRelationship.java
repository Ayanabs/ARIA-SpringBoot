package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "hr_dependent_relationship")
public class HrDependentRelationship {
    @Id
    @Column(name = "ID")
    private Integer iD;

    @Column(name = "Relationship")
    private String relationship;

}