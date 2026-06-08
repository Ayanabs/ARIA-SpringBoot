package org.accimt.aria.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HrQExperianceDto {
    private Integer id;
    private Integer empId;
    private String institute;
    private String designation;
    private String description;
    private LocalDate dateApp;
    private LocalDate dateRes;
}
