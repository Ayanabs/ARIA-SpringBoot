package org.accimt.aria.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "hr_depdetails")
public class HrDepdetails {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "EmpNo")
    private Integer empNo;

    @Column(name = "Relationship")
    private Integer relationship;

    @Column(name = "Name")
    private String name;

    @Column(name = "Birthday")
    private LocalDate birthday;

    @Column(name = "Idno")
    private String idno;

}