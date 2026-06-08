package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.PrDenyProjectsDto;
import org.accimt.aria.entity.PrDenyProjects;
import org.accimt.aria.exception.ResourceNotFoundException;
import org.accimt.aria.mapping.PrDenyProjectsMapping;
import org.accimt.aria.repository.PrDenyProjectsRepository;
import org.accimt.aria.service.PrDenyProjectsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PrDenyProjectsServiceImpl implements PrDenyProjectsService {

    private final PrDenyProjectsRepository prDenyProjectsRepository;
    private final PrDenyProjectsMapping prDenyProjectsMapping;

    @Override
    public PrDenyProjectsDto getPrDenyProjectsById(Integer id) {
        PrDenyProjects entity = prDenyProjectsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("PrDenyProjects not found with id: " + id));
        return prDenyProjectsMapping.toDto(entity);
    }

    @Override
    public List<PrDenyProjectsDto> getAllPrDenyProjects() {
        return prDenyProjectsRepository.findAll().stream()
                .map(prDenyProjectsMapping::toDto)
                .collect(Collectors.toList());
    }
}
