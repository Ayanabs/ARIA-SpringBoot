package org.accimt.aria.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DivBudgTblDto {
    private Integer divbCode;
    private Integer divCode;
    private String budgCode;
    private String budgYear;
    private String userDescrip;
    private Double reqAmount;
    private Double apprAmount;
    private String reqConfirm;
    private String appConfirm;
    private Double theAmount;
}
