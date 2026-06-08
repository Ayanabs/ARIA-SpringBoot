package org.accimt.aria.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SaLocationDto {
    private Integer locatonId;
    private Integer buildingId;
    private Integer divisionId;
    private String locatonInfo;
    private String shortForm;
}
