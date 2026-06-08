package org.accimt.aria.service;

import org.accimt.aria.dto.HrEduLevelsDto;
import java.util.List;

public interface HrEduLevelsService {
    HrEduLevelsDto getHrEduLevelById(Integer id);
    List<HrEduLevelsDto> getAllHrEduLevels();
}
