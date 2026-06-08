package org.accimt.aria.service;

import org.accimt.aria.dto.HrQExperianceDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HrQExperianceService {
    HrQExperianceDto getHrQExperianceById(Integer id);
    List<HrQExperianceDto> getAllHrQExperiance();
}
