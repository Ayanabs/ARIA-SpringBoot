package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "hr_q_grades")
public class HrQGrades {
    @Id
    @Column(name = "Grade_No")
    private String gradeNo;

    @Column(name = "Grade_Name")
    private String gradeName;

}