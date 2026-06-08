package org.accimt.aria.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MainSubDivisionDto {
    private Integer divId;
    private String mainDivCode;
    private Integer childDivCode;
}
