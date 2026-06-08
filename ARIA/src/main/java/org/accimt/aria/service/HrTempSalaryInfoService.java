package org.accimt.aria.service;

import org.accimt.aria.dto.HrTempSalaryInfoDto;
import java.util.List;

public interface HrTempSalaryInfoService {
    HrTempSalaryInfoDto getHrTempSalaryInfoByEmpNo(Integer empNo);
    List<HrTempSalaryInfoDto> getAllHrTempSalaryInfos();
}
