package org.accimt.aria.service;

import org.accimt.aria.dto.HrQHieduQualificationsDto;
import java.util.List;

public interface HrQHieduQualificationsService {
    HrQHieduQualificationsDto getHrQHieduQualificationsById(Integer id);
    List<HrQHieduQualificationsDto> getAllHrQHieduQualifications();
}
