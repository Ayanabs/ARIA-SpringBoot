package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrQOlsubjectsDto;
import org.accimt.aria.entity.HrQOlsubjects;
import org.accimt.aria.exception.ResourceNotFoundException;
import org.accimt.aria.mapping.HrQOlsubjectsMapping;
import org.accimt.aria.repository.HrQOlsubjectsRepository;
import org.accimt.aria.service.HrQOlsubjectsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrQOlsubjectsServiceImpl implements HrQOlsubjectsService {

    private final HrQOlsubjectsRepository hrQOlsubjectsRepository;
    private final HrQOlsubjectsMapping hrQOlsubjectsMapping;

    @Override
    public HrQOlsubjectsDto getHrQOlsubjectsById(Integer id) {
        HrQOlsubjects hrQOlsubjects = hrQOlsubjectsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("HrQOlsubjects not found with id: " + id));
        return hrQOlsubjectsMapping.toDto(hrQOlsubjects);
    }

    @Override
    public List<HrQOlsubjectsDto> getAllHrQOlsubjects() {
        return hrQOlsubjectsRepository.findAll().stream()
                .map(hrQOlsubjectsMapping::toDto)
                .collect(Collectors.toList());
    }
}
