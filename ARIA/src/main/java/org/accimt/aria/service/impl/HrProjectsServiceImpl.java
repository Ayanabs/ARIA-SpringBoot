package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrProjectsDto;
import org.accimt.aria.entity.HrProjects;
import org.accimt.aria.exception.ResourceNotFoundException;
import org.accimt.aria.mapping.HrProjectsMapping;
import org.accimt.aria.repository.HrProjectsRepository;
import org.accimt.aria.service.HrProjectsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrProjectsServiceImpl implements HrProjectsService {

    private final HrProjectsRepository hrProjectsRepository;
    private final HrProjectsMapping hrProjectsMapping;

    @Override
    public HrProjectsDto getHrProjectsById(Integer id) {
        HrProjects hrProjects = hrProjectsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("HrProjects not found with id: " + id));
        return hrProjectsMapping.toDto(hrProjects);
    }

    @Override
    public List<HrProjectsDto> getAllHrProjects() {
        return hrProjectsRepository.findAll().stream()
                .map(hrProjectsMapping::toDto)
                .collect(Collectors.toList());
    }
}
