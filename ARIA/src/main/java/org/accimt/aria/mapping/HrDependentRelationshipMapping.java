package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.accimt.aria.dto.HrDependentRelationshipDto;
import org.accimt.aria.entity.HrDependentRelationship;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HrDependentRelationshipMapping {

    private final ObjectMapper objectMapper;
    public HrDependentRelationshipDto toDto(HrDependentRelationship entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrDependentRelationshipDto.class);
    }

    public HrDependentRelationship mapToEntity(HrDependentRelationshipDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrDependentRelationship.class);
    }
}
