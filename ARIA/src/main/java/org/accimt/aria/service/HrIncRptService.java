package org.accimt.aria.service;

import org.accimt.aria.dto.HrIncRptDto;
import java.util.List;

public interface HrIncRptService {
    HrIncRptDto getHrIncRptById(Integer id);
    List<HrIncRptDto> getAllHrIncRpts();
}
