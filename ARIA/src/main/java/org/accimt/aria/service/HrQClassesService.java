package org.accimt.aria.service;

import org.accimt.aria.dto.HrQClassesDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HrQClassesService {
    HrQClassesDto getHrQClassesById(Integer id);
    List<HrQClassesDto> getAllHrQClasses();
}
