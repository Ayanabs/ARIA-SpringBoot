package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "hr_higheredu_details")
public class HrHighereduDetails {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "emp_no")
    private Integer empNo;

    @Column(name = "sub_edu_type")
    private Integer subEduType;

    @Column(name = "higher_edu_level")
    private Integer higherEduLevel;

    @Column(name = "description")
    private String description;

}