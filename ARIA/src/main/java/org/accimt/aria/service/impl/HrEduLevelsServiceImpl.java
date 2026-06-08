package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrEduLevelsDto;
import org.accimt.aria.entity.HrEduLevels;
import org.accimt.aria.mapping.HrEduLevelsMapping;
import org.accimt.aria.repository.HrEduLevelsRepository;
import org.accimt.aria.service.HrEduLevelsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrEduLevelsServiceImpl implements HrEduLevelsService {

    private final HrEduLevelsRepository hrEduLevelsRepository;
    private final HrEduLevelsMapping hrEduLevelsMapping;

    @Override
    public HrEduLevelsDto getHrEduLevelById(Integer id) {
        HrEduLevels entity = hrEduLevelsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("HrEduLevels not found with id: " + id));
        return hrEduLevelsMapping.toDto(entity);
    }

    @Override
    public List<HrEduLevelsDto> getAllHrEduLevels() {
        return hrEduLevelsRepository.findAll().stream()
                .map(hrEduLevelsMapping::toDto)
                .collect(Collectors.toList());
    }
}
