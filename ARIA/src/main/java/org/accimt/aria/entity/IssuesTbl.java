package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "issues_tbl")
public class IssuesTbl {
    @Id
    @Column(name = "AttDtId")
    private Integer attDtId;

    @Column(name = "EmpNo")
    private Integer empNo;

    @Column(name = "Desc")
    private String desc;

    @Column(name = "issue_type")
    private Integer issueType;

}