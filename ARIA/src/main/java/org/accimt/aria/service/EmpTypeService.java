package org.accimt.aria.service;

import org.accimt.aria.dto.EmpTypeDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmpTypeService {

    EmpTypeDto getEmpTypeById(Integer id);
    List<EmpTypeDto> getAllEmpTypes();

}
