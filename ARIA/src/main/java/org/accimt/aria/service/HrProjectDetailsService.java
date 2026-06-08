package org.accimt.aria.service;

import org.accimt.aria.dto.HrProjectDetailsDto;
import java.util.List;

public interface HrProjectDetailsService {
    HrProjectDetailsDto getHrProjectDetailsBySerialNo(Integer serialNo);
    List<HrProjectDetailsDto> getAllHrProjectDetails();
}
