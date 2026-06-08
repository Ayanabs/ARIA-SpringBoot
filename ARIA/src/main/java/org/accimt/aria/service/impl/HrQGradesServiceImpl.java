package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrQGradesDto;
import org.accimt.aria.entity.HrQGrades;
import org.accimt.aria.mapping.HrQGradesMapping;
import org.accimt.aria.repository.HrQGradesRepository;
import org.accimt.aria.service.HrQGradesService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrQGradesServiceImpl implements HrQGradesService {

    private final HrQGradesRepository hrQGradesRepository;
    private final HrQGradesMapping hrQGradesMapping;

    @Override
    public HrQGradesDto getHrQGradesById(String id) {
        HrQGrades entity = hrQGradesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("HrQGrades not found with id: " + id));
        return hrQGradesMapping.toDto(entity);
    }

    @Override
    public List<HrQGradesDto> getAllHrQGrades() {
        return hrQGradesRepository.findAll().stream()
                .map(hrQGradesMapping::toDto)
                .collect(Collectors.toList());
    }
}
