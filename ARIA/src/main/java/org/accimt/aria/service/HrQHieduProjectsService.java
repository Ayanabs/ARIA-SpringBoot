package org.accimt.aria.service;

import org.accimt.aria.dto.HrQHieduProjectsDto;
import java.util.List;

public interface HrQHieduProjectsService {
    HrQHieduProjectsDto getHrQHieduProjectsById(Integer id);
    List<HrQHieduProjectsDto> getAllHrQHieduProjects();
}
