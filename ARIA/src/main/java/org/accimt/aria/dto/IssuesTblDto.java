package org.accimt.aria.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class IssuesTblDto {
    private Integer attDtId;
    private Integer empNo;
    private String desc;
    private Integer issueType;
}
