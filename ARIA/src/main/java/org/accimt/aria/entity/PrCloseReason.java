package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "pr_close_reason")
public class PrCloseReason {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "pr_type")
    private String prType;

    @Column(name = "cl_reason")
    private String clReason;

    @Column(name = "order_re")
    private String orderRe;

}