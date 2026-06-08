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

}
