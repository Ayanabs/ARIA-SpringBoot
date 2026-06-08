package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.HrDependentRelationshipDto;
import org.accimt.aria.entity.HrDependentRelationship;
import org.accimt.aria.mapping.HrDependentRelationshipMapping;
import org.accimt.aria.repository.HrDependentRelationshipRepository;
import org.accimt.aria.service.HrDependentRelationshipService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class HrDependentRelationshipServiceImpl implements HrDependentRelationshipService {

    private final HrDependentRelationshipRepository hrDependentRelationshipRepository;
    private final HrDependentRelationshipMapping hrDependentRelationshipMapping;

    @Override
    public HrDependentRelationshipDto getHrDependentRelationshipById(Integer id) {
        HrDependentRelationship entity = hrDependentRelationshipRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("HrDependentRelationship not found with id: " + id));
        return hrDependentRelationshipMapping.toDto(entity);
    }

    @Override
    public List<HrDependentRelationshipDto> getAllHrDependentRelationships() {
        return hrDependentRelationshipRepository.findAll().stream()
                .map(hrDependentRelationshipMapping::toDto)
                .collect(Collectors.toList());
    }
}
