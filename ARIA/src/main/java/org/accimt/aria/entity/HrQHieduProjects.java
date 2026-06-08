package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "hr_q_hiedu_projects")
public class HrQHieduProjects {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "qualID")
    private Integer qualID;

    @Column(name = "title")
    private String title;

    @Column(name = "year")
    private Integer year;

    @Column(name = "description")
    private String description;

}