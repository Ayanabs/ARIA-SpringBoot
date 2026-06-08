package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "deny_projects")
public class DenyProjects {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "p_code")
    private String pCode;

    @Column(name = "reason")
    private String reason;

}