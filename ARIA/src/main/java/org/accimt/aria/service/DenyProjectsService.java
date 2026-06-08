package org.accimt.aria.service;

import org.accimt.aria.dto.DenyProjectsDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DenyProjectsService {
    DenyProjectsDto getDenyProjectById(Integer id);
    List<DenyProjectsDto> getAllDenyProjects();
}
