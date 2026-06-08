package org.accimt.aria.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "pr_deny_projects")
public class PrDenyProjects {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "p_code")
    private String pCode;

    @Column(name = "reason")
    private String reason;

    @Column(name = "date_time")
    private LocalDateTime dateTime;

    @Column(name = "User_id")
    private Integer userId;

    @Column(name = "User_type")
    private String userType;

}