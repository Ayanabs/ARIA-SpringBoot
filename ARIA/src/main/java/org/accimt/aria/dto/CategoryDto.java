package org.accimt.aria.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {
    private Integer categorycode;
    private String category;
    private LocalTime intime;
    private Integer outtimeh;
    private Integer outtimem;
    private LocalTime adjesttime;
    private LocalTime latetime;
    private LocalTime spLatetime;
}
