package org.accimt.aria.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "hr_q_experiance")
public class HrQExperiance {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "emp_id")
    private Integer empId;

    @Column(name = "institute")
    private String institute;

    @Column(name = "designation")
    private String designation;

    @Column(name = "description")
    private String description;

    @Column(name = "date_app")
    private LocalDate dateApp;

    @Column(name = "date_res")
    private LocalDate dateRes;

}