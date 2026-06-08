package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.EmpLvTblDto;
import org.accimt.aria.entity.EmpLvTbl;
import org.accimt.aria.mapping.EmpLvTblMapping;
import org.accimt.aria.repository.EmpLvTblRepository;
import org.accimt.aria.service.EmpLvTblService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmpLvTblServiceImpl implements EmpLvTblService {

    private final EmpLvTblRepository empLvTblRepository;
    private final EmpLvTblMapping empLvTblMapping;

    @Override
    public EmpLvTblDto getEmpLvTblById(Integer id) {
        EmpLvTbl entity = empLvTblRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("EmpLvTbl not found with id: " + id));
        return empLvTblMapping.toDto(entity);
    }

    @Override
    public List<EmpLvTblDto> getAllEmpLvTbls() {
        return empLvTblRepository.findAll().stream()
                .map(empLvTblMapping::toDto)
                .collect(Collectors.toList());
    }
}
