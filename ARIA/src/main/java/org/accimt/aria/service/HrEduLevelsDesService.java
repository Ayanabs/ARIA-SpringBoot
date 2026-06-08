package org.accimt.aria.service;

import org.accimt.aria.dto.HrEduLevelsDesDto;
import java.util.List;

public interface HrEduLevelsDesService {
    HrEduLevelsDesDto getHrEduLevelsDesById(Integer id);
    List<HrEduLevelsDesDto> getAllHrEduLevelsDes();
}
