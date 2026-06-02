package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.DesignationDto;
import org.accimt.aria.entity.Designation;
import org.accimt.aria.mapping.DesignationMapping;
import org.accimt.aria.repository.DesignationRepository;
import org.accimt.aria.service.DesignationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class DesignationServiceImpl implements DesignationService {

    private final DesignationRepository designationRepository;
    private final DesignationMapping designationMapping;

    @Override
    public DesignationDto createDesignation(DesignationDto dto) {
        Designation entity = designationMapping.mapToEntity(dto);
        Designation savedEntity = designationRepository.save(entity);
        return designationMapping.toDto(savedEntity);
    }

    @Override
    public DesignationDto updateDesignation(DesignationDto dto) {
        Designation existing = designationRepository.findById(dto.getDesigcode())
                .orElseThrow(() -> new RuntimeException("Designation not found with code: " + dto.getDesigcode()));

        if (dto.getDesignation() != null) existing.setDesignation(dto.getDesignation());
        if (dto.getMainid() != null) existing.setMainid(dto.getMainid());

        Designation updated = designationRepository.save(existing);
        return designationMapping.toDto(updated);
    }

    @Override
    public DesignationDto getDesignationById(Integer id) {
        Designation entity = designationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Designation not found with code: " + id));
        return designationMapping.toDto(entity);
    }

    @Override
    public List<DesignationDto> getAllDesignations() {
        return designationRepository.findAll().stream()
                .map(designationMapping::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteDesignationById(Integer id) {
        throw new UnsupportedOperationException("Deletions are not allowed in this project");
    }
}
