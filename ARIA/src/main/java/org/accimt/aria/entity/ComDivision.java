package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "com_division")
public class ComDivision {
    @Id
    @Column(name = "div_id")
    private Integer divId;

    @Column(name = "Mdiv_code")
    private String mdivCode;

    @Column(name = "Tdiv_code")
    private String tdivCode;

}