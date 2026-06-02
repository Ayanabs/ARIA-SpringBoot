package org.accimt.aria.service;

import org.accimt.aria.dto.DesignationDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DesignationService {
    DesignationDto createDesignation(DesignationDto dto);
    DesignationDto updateDesignation(DesignationDto dto);
    DesignationDto getDesignationById(Integer id);
    List<DesignationDto> getAllDesignations();
    void deleteDesignationById(Integer id);
}
