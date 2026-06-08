package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "hr_q_classes")
public class HrQClasses {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "description")
    private String description;

}