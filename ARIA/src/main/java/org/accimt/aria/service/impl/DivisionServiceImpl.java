package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.DivisionDto;
import org.accimt.aria.entity.Division;
import org.accimt.aria.mapping.DivisionMapping;
import org.accimt.aria.repository.DivisionRepository;
import org.accimt.aria.service.DivisionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class DivisionServiceImpl implements DivisionService {

    private final DivisionRepository divisionRepository;
    private final DivisionMapping divisionMapping;


    @Override
    public DivisionDto getDivisionById(Integer id) {
        Division division = divisionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Division not found with code: " + id));
        return divisionMapping.toDto(division);
    }

    @Override
    public List<DivisionDto> getAllDivisions() {
        return divisionRepository.findAll().stream()
                .map(divisionMapping::toDto)
                .collect(Collectors.toList());
    }


}
