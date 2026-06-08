package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.MainSubDivisionDto;
import org.accimt.aria.entity.MainSubDivision;
import org.accimt.aria.mapping.MainSubDivisionMapping;
import org.accimt.aria.repository.MainSubDivisionRepository;
import org.accimt.aria.service.MainSubDivisionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MainSubDivisionServiceImpl implements MainSubDivisionService {

    private final MainSubDivisionRepository mainSubDivisionRepository;
    private final MainSubDivisionMapping mainSubDivisionMapping;

    @Override
    public MainSubDivisionDto getMainSubDivisionById(Integer id) {
        MainSubDivision entity = mainSubDivisionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("MainSubDivision not found with id: " + id));
        return mainSubDivisionMapping.toDto(entity);
    }

    @Override
    public List<MainSubDivisionDto> getAllMainSubDivisions() {
        return mainSubDivisionRepository.findAll().stream()
                .map(mainSubDivisionMapping::toDto)
                .collect(Collectors.toList());
    }
}
