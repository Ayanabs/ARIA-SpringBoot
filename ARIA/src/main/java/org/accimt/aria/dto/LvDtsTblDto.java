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
public class LvDtsTblDto {
    private Integer id;
    private Integer leaveId;
    private LocalDate leaveDate;
    private Double noOfDays;
}
