package org.accimt.aria.service;

import org.accimt.aria.dto.HrPersonalDetailsDto;
import java.util.List;

public interface HrPersonalDetailsService {
    HrPersonalDetailsDto getHrPersonalDetailsByEmpNo(Integer empNo);
    List<HrPersonalDetailsDto> getAllHrPersonalDetails();
}
