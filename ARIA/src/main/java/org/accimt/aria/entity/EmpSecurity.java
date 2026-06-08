package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "emp_security")
public class EmpSecurity {
    @Id
    @Column(name = "emp_id")
    private Integer empId;

    @Column(name = "name")
    private String name;

    @Column(name = "id_no")
    private String idNo;

    @Column(name = "rank")
    private String rank;

    @Column(name = "status")
    private Integer status;

}