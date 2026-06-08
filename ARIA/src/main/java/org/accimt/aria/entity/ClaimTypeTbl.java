package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "claim_type_tbl")
public class ClaimTypeTbl {
    @Id
    @Column(name = "C_Type_Id")
    private Integer cTypeId;

    @Column(name = "C_Type")
    private String cType;

}