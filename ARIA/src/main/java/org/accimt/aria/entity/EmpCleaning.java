package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "emp_cleaning")
public class EmpCleaning {
    @Id
    @Column(name = "emp_id")
    private Integer empId;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "telno")
    private Integer telno;

}