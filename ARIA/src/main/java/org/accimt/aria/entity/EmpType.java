package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "emp_type_tbl")
public class EmpType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emptypecode")
    private Integer emptypecode;

    @Column(name = "emptype", length = 50)
    private String emptype;
}
