package org.accimt.aria.service;

import org.accimt.aria.dto.DesignationDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DesignationService {

    DesignationDto getDesignationById(Integer id);
    List<DesignationDto> getAllDesignations();

}
