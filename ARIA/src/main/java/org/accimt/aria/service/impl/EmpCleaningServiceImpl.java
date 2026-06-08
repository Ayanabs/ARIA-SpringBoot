package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.EmpCleaningDto;
import org.accimt.aria.entity.EmpCleaning;
import org.accimt.aria.mapping.EmpCleaningMapping;
import org.accimt.aria.repository.EmpCleaningRepository;
import org.accimt.aria.service.EmpCleaningService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmpCleaningServiceImpl implements EmpCleaningService {

    private final EmpCleaningRepository empCleaningRepository;
    private final EmpCleaningMapping empCleaningMapping;

    @Override
    public EmpCleaningDto getEmpCleaningById(Integer id) {
        EmpCleaning entity = empCleaningRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("EmpCleaning not found with id: " + id));
        return empCleaningMapping.toDto(entity);
    }

    @Override
    public List<EmpCleaningDto> getAllEmpCleanings() {
        return empCleaningRepository.findAll().stream()
                .map(empCleaningMapping::toDto)
                .collect(Collectors.toList());
    }
}
