package org.accimt.aria.service;

import org.accimt.aria.dto.HrOfficialDetailsDto;
import java.util.List;

public interface HrOfficialDetailsService {
    HrOfficialDetailsDto getHrOfficialDetailsByEmpNo(Integer empNo);
    List<HrOfficialDetailsDto> getAllHrOfficialDetails();
}
