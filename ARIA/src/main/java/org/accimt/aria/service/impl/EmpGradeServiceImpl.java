package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.EmpGradeDto;
import org.accimt.aria.entity.EmpGrade;
import org.accimt.aria.mapping.EmpGradeMapping;
import org.accimt.aria.repository.EmpGradeRepository;
import org.accimt.aria.service.EmpGradeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmpGradeServiceImpl implements EmpGradeService {

    private final EmpGradeRepository empGradeRepository;
    private final EmpGradeMapping empGradeMapping;

    @Override
    public EmpGradeDto getEmpGradeById(Integer id) {
        EmpGrade entity = empGradeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("EmpGrade not found with id: " + id));
        return empGradeMapping.toDto(entity);
    }

    @Override
    public List<EmpGradeDto> getAllEmpGrades() {
        return empGradeRepository.findAll().stream()
                .map(empGradeMapping::toDto)
                .collect(Collectors.toList());
    }
}
