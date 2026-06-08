package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.EmpSecurityDto;
import org.accimt.aria.entity.EmpSecurity;
import org.accimt.aria.mapping.EmpSecurityMapping;
import org.accimt.aria.repository.EmpSecurityRepository;
import org.accimt.aria.service.EmpSecurityService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmpSecurityServiceImpl implements EmpSecurityService {

    private final EmpSecurityRepository empSecurityRepository;
    private final EmpSecurityMapping empSecurityMapping;

    @Override
    public EmpSecurityDto getEmpSecurityById(Integer id) {
        EmpSecurity entity = empSecurityRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("EmpSecurity not found with id: " + id));
        return empSecurityMapping.toDto(entity);
    }

    @Override
    public List<EmpSecurityDto> getAllEmpSecurities() {
        return empSecurityRepository.findAll().stream()
                .map(empSecurityMapping::toDto)
                .collect(Collectors.toList());
    }
}
