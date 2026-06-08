package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "hr_q_alsubjects")
public class HrQAlsubjects {
    @Id
    @Column(name = "Sub_No")
    private Integer subNo;

    @Column(name = "Sub_Name")
    private String subName;

}