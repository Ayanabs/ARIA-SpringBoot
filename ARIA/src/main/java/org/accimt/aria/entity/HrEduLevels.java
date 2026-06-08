package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "hr_edu_levels")
public class HrEduLevels {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "Description")
    private String description;

}