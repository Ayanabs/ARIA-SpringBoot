package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrQAlsubjectsDto;
import org.accimt.aria.entity.HrQAlsubjects;
import org.accimt.aria.exception.ResourceNotFoundException;
import org.accimt.aria.mapping.HrQAlsubjectsMapping;
import org.accimt.aria.repository.HrQAlsubjectsRepository;
import org.accimt.aria.service.HrQAlsubjectsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrQAlsubjectsServiceImpl implements HrQAlsubjectsService {

    private final HrQAlsubjectsRepository hrQAlsubjectsRepository;
    private final HrQAlsubjectsMapping hrQAlsubjectsMapping;

    @Override
    public HrQAlsubjectsDto getHrQAlsubjectsById(Integer id) {
        HrQAlsubjects hrQAlsubjects = hrQAlsubjectsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("HrQAlsubjects not found with id: " + id));
        return hrQAlsubjectsMapping.toDto(hrQAlsubjects);
    }

    @Override
    public List<HrQAlsubjectsDto> getAllHrQAlsubjects() {
        return hrQAlsubjectsRepository.findAll().stream()
                .map(hrQAlsubjectsMapping::toDto)
                .collect(Collectors.toList());
    }
}
