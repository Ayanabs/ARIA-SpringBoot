package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrQExperianceDto;
import org.accimt.aria.entity.HrQExperiance;
import org.accimt.aria.exception.ResourceNotFoundException;
import org.accimt.aria.mapping.HrQExperianceMapping;
import org.accimt.aria.repository.HrQExperianceRepository;
import org.accimt.aria.service.HrQExperianceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrQExperianceServiceImpl implements HrQExperianceService {

    private final HrQExperianceRepository hrQExperianceRepository;
    private final HrQExperianceMapping hrQExperianceMapping;

    @Override
    public HrQExperianceDto getHrQExperianceById(Integer id) {
        HrQExperiance hrQExperiance = hrQExperianceRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("HrQExperiance not found with id: " + id));
        return hrQExperianceMapping.toDto(hrQExperiance);
    }

    @Override
    public List<HrQExperianceDto> getAllHrQExperiance() {
        return hrQExperianceRepository.findAll().stream()
                .map(hrQExperianceMapping::toDto)
                .collect(Collectors.toList());
    }
}
