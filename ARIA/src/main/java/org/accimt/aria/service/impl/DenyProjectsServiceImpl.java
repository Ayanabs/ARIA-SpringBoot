package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.DenyProjectsDto;
import org.accimt.aria.entity.DenyProjects;
import org.accimt.aria.mapping.DenyProjectsMapping;
import org.accimt.aria.repository.DenyProjectsRepository;
import org.accimt.aria.service.DenyProjectsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class DenyProjectsServiceImpl implements DenyProjectsService {

    private final DenyProjectsRepository denyProjectsRepository;
    private final DenyProjectsMapping denyProjectsMapping;

    @Override
    public DenyProjectsDto getDenyProjectById(Integer id) {
        DenyProjects entity = denyProjectsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("DenyProjects not found with id: " + id));
        return denyProjectsMapping.toDto(entity);
    }

    @Override
    public List<DenyProjectsDto> getAllDenyProjects() {
        return denyProjectsRepository.findAll().stream()
                .map(denyProjectsMapping::toDto)
                .collect(Collectors.toList());
    }
}
