package org.accimt.aria.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HrQHieduProjectsDto {
    private Integer id;
    private Integer qualID;
    private String title;
    private Integer year;
    private String description;
}
