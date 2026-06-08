package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.PrProjectsDto;
import org.accimt.aria.entity.PrProjects;
import org.accimt.aria.mapping.PrProjectsMapping;
import org.accimt.aria.repository.PrProjectsRepository;
import org.accimt.aria.service.PrProjectsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PrProjectsServiceImpl implements PrProjectsService {

    private final PrProjectsRepository prProjectsRepository;
    private final PrProjectsMapping prProjectsMapping;

    @Override
    public PrProjectsDto getPrProjectsById(Integer serialNo) {
        PrProjects prProjects = prProjectsRepository.findById(serialNo)
                .orElseThrow(() -> new RuntimeException("PrProjects not found with serialNo: " + serialNo));
        return prProjectsMapping.toDto(prProjects);
    }

    @Override
    public List<PrProjectsDto> getAllPrProjects() {
        return prProjectsRepository.findAll().stream()
                .map(prProjectsMapping::toDto)
                .collect(Collectors.toList());
    }
}
