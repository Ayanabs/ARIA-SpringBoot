package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrQHieduProjectsDto;
import org.accimt.aria.entity.HrQHieduProjects;
import org.accimt.aria.mapping.HrQHieduProjectsMapping;
import org.accimt.aria.repository.HrQHieduProjectsRepository;
import org.accimt.aria.service.HrQHieduProjectsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrQHieduProjectsServiceImpl implements HrQHieduProjectsService {

    private final HrQHieduProjectsRepository hrQHieduProjectsRepository;
    private final HrQHieduProjectsMapping hrQHieduProjectsMapping;

    @Override
    public HrQHieduProjectsDto getHrQHieduProjectsById(Integer id) {
        HrQHieduProjects entity = hrQHieduProjectsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("HrQHieduProjects not found with id: " + id));
        return hrQHieduProjectsMapping.toDto(entity);
    }

    @Override
    public List<HrQHieduProjectsDto> getAllHrQHieduProjects() {
        return hrQHieduProjectsRepository.findAll().stream()
                .map(hrQHieduProjectsMapping::toDto)
                .collect(Collectors.toList());
    }
}
