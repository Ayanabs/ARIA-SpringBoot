package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.EmpSlvTblDto;
import org.accimt.aria.entity.EmpSlvTbl;
import org.accimt.aria.mapping.EmpSlvTblMapping;
import org.accimt.aria.repository.EmpSlvTblRepository;
import org.accimt.aria.service.EmpSlvTblService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmpSlvTblServiceImpl implements EmpSlvTblService {

    private final EmpSlvTblRepository empSlvTblRepository;
    private final EmpSlvTblMapping empSlvTblMapping;

    @Override
    public EmpSlvTblDto getEmpSlvTblById(Integer id) {
        EmpSlvTbl entity = empSlvTblRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("EmpSlvTbl not found with id: " + id));
        return empSlvTblMapping.toDto(entity);
    }

    @Override
    public List<EmpSlvTblDto> getAllEmpSlvTbls() {
        return empSlvTblRepository.findAll().stream()
                .map(empSlvTblMapping::toDto)
                .collect(Collectors.toList());
    }
}
