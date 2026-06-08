package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "emp_grade")
public class EmpGrade {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "grade")
    private String grade;

    @Column(name = "grades")
    private String grades;

}