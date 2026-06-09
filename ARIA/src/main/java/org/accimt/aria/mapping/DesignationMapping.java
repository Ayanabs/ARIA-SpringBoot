package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.accimt.aria.dto.DesignationDto;
import org.accimt.aria.entity.Designation;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DesignationMapping {

    private final ObjectMapper objectMapper;
    public DesignationDto toDto(Designation entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, DesignationDto.class);
    }

    public Designation mapToEntity(DesignationDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, Designation.class);
    }
}
