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
public class HrDepdetailsDto {
    private Integer id;
    private Integer empNo;
    private Integer relationship;
    private String name;
    private LocalDate birthday;
    private String idno;
}
