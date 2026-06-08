package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "hr_edu_levels_des")
public class HrEduLevelsDes {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "subType_no")
    private Integer subTypeNo;

    @Column(name = "description")
    private String description;

}