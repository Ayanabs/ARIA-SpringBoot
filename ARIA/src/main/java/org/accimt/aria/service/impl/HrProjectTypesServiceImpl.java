package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrProjectTypesDto;
import org.accimt.aria.entity.HrProjectTypes;
import org.accimt.aria.exception.ResourceNotFoundException;
import org.accimt.aria.mapping.HrProjectTypesMapping;
import org.accimt.aria.repository.HrProjectTypesRepository;
import org.accimt.aria.service.HrProjectTypesService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrProjectTypesServiceImpl implements HrProjectTypesService {

    private final HrProjectTypesRepository hrProjectTypesRepository;
    private final HrProjectTypesMapping hrProjectTypesMapping;

    @Override
    public HrProjectTypesDto getHrProjectTypesById(Integer id) {
        HrProjectTypes hrProjectTypes = hrProjectTypesRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("HrProjectTypes not found with id: " + id));
        return hrProjectTypesMapping.toDto(hrProjectTypes);
    }

    @Override
    public List<HrProjectTypesDto> getAllHrProjectTypes() {
        return hrProjectTypesRepository.findAll().stream()
                .map(hrProjectTypesMapping::toDto)
                .collect(Collectors.toList());
    }
}
