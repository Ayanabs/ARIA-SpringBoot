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
    public DivisionDto createDivision(DivisionDto dto) {
        Division entity = divisionMapping.mapToEntity(dto);
        Division savedDivision = divisionRepository.save(entity);
        return divisionMapping.toDto(savedDivision);
    }

    @Override
    public DivisionDto updateDivision(DivisionDto dto) {
        Division existingDivision = divisionRepository.findById(dto.getDivisioncode())
                .orElseThrow(() -> new RuntimeException("Division not found with code: " + dto.getDivisioncode()));

        if (dto.getDivision() != null) existingDivision.setDivision(dto.getDivision());
        if (dto.getShCode() != null) existingDivision.setShCode(dto.getShCode());
        if (dto.getHod() != null) existingDivision.setHod(dto.getHod());
        if (dto.getDdg() != null) existingDivision.setDdg(dto.getDdg());
        if (dto.getDg() != null) existingDivision.setDg(dto.getDg());

        Division updatedDivision = divisionRepository.save(existingDivision);
        return divisionMapping.toDto(updatedDivision);
    }

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

    @Override
    public void deleteDivisionById(Integer id) {
        throw new UnsupportedOperationException("Deletions are not allowed in this project");
    }
}
