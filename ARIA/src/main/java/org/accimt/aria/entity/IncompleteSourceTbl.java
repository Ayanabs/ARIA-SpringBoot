package org.accimt.aria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "incomplete_source_tbl")
public class IncompleteSourceTbl {
    @Id
    @Column(name = "ID")
    private Integer iD;

    @Column(name = "Description")
    private String description;

}