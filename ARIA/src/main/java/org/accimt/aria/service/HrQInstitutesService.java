package org.accimt.aria.service;

import org.accimt.aria.dto.HrQInstitutesDto;
import java.util.List;

public interface HrQInstitutesService {
    HrQInstitutesDto getHrQInstitutesById(Integer id);
    List<HrQInstitutesDto> getAllHrQInstitutes();
}
