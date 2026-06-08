package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.EmpTypeDto;
import org.accimt.aria.entity.EmpType;
import org.accimt.aria.mapping.EmpTypeMapping;
import org.accimt.aria.repository.EmpTypeRepository;
import org.accimt.aria.service.EmpTypeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmpTypeServiceImpl implements EmpTypeService {

    private final EmpTypeRepository empTypeRepository;
    private final EmpTypeMapping empTypeMapping;

    @Override
    public EmpTypeDto getEmpTypeById(Integer id) {
        EmpType entity = empTypeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee Type not found with code: " + id));
        return empTypeMapping.toDto(entity);
    }

    @Override
    public List<EmpTypeDto> getAllEmpTypes() {
        return empTypeRepository.findAll().stream()
                .map(empTypeMapping::toDto)
                .collect(Collectors.toList());
    }


}
