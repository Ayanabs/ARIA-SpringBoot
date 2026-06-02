package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "hr_salary")
public class HrSalary {

    @Id
    @Column(name = "salarycode", length = 50)
    private String salarycode;

    @Column(name = "salaryscale", length = 100)
    private String salaryscale;
}
