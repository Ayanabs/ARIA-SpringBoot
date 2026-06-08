package org.accimt.aria.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HrQHieduQualificationsDto {
    private Integer id;
    private Integer empNo;
    private Integer instituteID;
    private String field;
    private Integer year;
    private Integer classID;
    private Integer duration;
    private Integer level;
}
