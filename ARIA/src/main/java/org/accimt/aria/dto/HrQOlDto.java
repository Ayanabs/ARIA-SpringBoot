package org.accimt.aria.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HrQOlDto {
    private Integer hrOlQid;
    private String empNo;
    private String oLIndex;
    private String oLSubNo;
    private String oLSubGrade;
    private Integer oLYear;
}
