package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "pr_deny_closedprj")
public class PrDenyClosedprj {
    @Id
    @Column(name = "p_code")
    private String pCode;

    @Column(name = "close_reason")
    private String closeReason;

}