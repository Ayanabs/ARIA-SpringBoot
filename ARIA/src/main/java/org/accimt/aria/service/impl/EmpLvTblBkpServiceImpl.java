package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.EmpLvTblBkpDto;
import org.accimt.aria.entity.EmpLvTblBkp;
import org.accimt.aria.mapping.EmpLvTblBkpMapping;
import org.accimt.aria.repository.EmpLvTblBkpRepository;
import org.accimt.aria.service.EmpLvTblBkpService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmpLvTblBkpServiceImpl implements EmpLvTblBkpService {

    private final EmpLvTblBkpRepository empLvTblBkpRepository;
    private final EmpLvTblBkpMapping empLvTblBkpMapping;

    @Override
    public EmpLvTblBkpDto getEmpLvTblBkpById(Integer id) {
        EmpLvTblBkp entity = empLvTblBkpRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("EmpLvTblBkp not found with id: " + id));
        return empLvTblBkpMapping.toDto(entity);
    }

    @Override
    public List<EmpLvTblBkpDto> getAllEmpLvTblBkps() {
        return empLvTblBkpRepository.findAll().stream()
                .map(empLvTblBkpMapping::toDto)
                .collect(Collectors.toList());
    }
}
