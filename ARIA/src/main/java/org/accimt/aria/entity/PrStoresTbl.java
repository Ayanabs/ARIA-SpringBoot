package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "pr_stores_tbl")
public class PrStoresTbl {
    @Id
    @Column(name = "st_id")
    private Integer stId;

    @Column(name = "serial_no")
    private Integer serialNo;

    @Column(name = "st_code")
    private String stCode;

}