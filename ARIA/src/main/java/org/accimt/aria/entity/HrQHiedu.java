package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "hr_q_hiedu")
public class HrQHiedu {
    @Column(name = "EmpNo")
    private String empNo;

    @Column(name = "hiEduDiploma")
    private String hiEduDiploma;

    @Column(name = "hiEduDegree")
    private String hiEduDegree;

    @Column(name = "hiEduExp")
    private String hiEduExp;

    @Column(name = "hiEduCertificate")
    private String hiEduCertificate;

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "hiEduPhD")
    private String hiEduPhD;

    @Column(name = "hiEduMasters")
    private String hiEduMasters;

    @Column(name = "hiEduProfeQli")
    private String hiEduProfeQli;

}