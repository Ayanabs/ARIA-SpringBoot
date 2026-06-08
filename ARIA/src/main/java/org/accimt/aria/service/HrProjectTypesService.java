package org.accimt.aria.service;

import org.accimt.aria.dto.HrProjectTypesDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HrProjectTypesService {
    HrProjectTypesDto getHrProjectTypesById(Integer id);
    List<HrProjectTypesDto> getAllHrProjectTypes();
}
