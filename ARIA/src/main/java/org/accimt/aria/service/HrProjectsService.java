package org.accimt.aria.service;

import org.accimt.aria.dto.HrProjectsDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HrProjectsService {
    HrProjectsDto getHrProjectsById(Integer id);
    List<HrProjectsDto> getAllHrProjects();
}
