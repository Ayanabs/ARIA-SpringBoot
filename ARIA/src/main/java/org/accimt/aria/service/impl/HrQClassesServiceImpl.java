package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrQClassesDto;
import org.accimt.aria.entity.HrQClasses;
import org.accimt.aria.exception.ResourceNotFoundException;
import org.accimt.aria.mapping.HrQClassesMapping;
import org.accimt.aria.repository.HrQClassesRepository;
import org.accimt.aria.service.HrQClassesService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrQClassesServiceImpl implements HrQClassesService {

    private final HrQClassesRepository hrQClassesRepository;
    private final HrQClassesMapping hrQClassesMapping;

    @Override
    public HrQClassesDto getHrQClassesById(Integer id) {
        HrQClasses hrQClasses = hrQClassesRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("HrQClasses not found with id: " + id));
        return hrQClassesMapping.toDto(hrQClasses);
    }

    @Override
    public List<HrQClassesDto> getAllHrQClasses() {
        return hrQClassesRepository.findAll().stream()
                .map(hrQClassesMapping::toDto)
                .collect(Collectors.toList());
    }
}
