package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "hr_q_hiedu_qualifications")
public class HrQHieduQualifications {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "empNo")
    private Integer empNo;

    @Column(name = "instituteID")
    private Integer instituteID;

    @Column(name = "field")
    private String field;

    @Column(name = "year")
    private Integer year;

    @Column(name = "classID")
    private Integer classID;

    @Column(name = "duration")
    private Integer duration;

    @Column(name = "level")
    private Integer level;

}