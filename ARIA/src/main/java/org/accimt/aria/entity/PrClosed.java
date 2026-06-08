package org.accimt.aria.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "pr_closed")
public class PrClosed {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "cl_id")
    private Integer clId;

    @Column(name = "p_type")
    private String pType;

    @Column(name = "cl_reason")
    private String clReason;

    @Column(name = "hdate")
    private LocalDate hdate;

    @Column(name = "invoice")
    private String invoice;

    @Column(name = "rdate")
    private LocalDate rdate;

    @Column(name = "adate")
    private LocalDate adate;

    @Column(name = "cname")
    private String cname;

    @Column(name = "oreason")
    private String oreason;

    @Column(name = "otherdetails")
    private String otherdetails;

}