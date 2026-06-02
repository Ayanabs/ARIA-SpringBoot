package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.accimt.aria.dto.DesignationDto;
import org.accimt.aria.entity.Designation;
import org.springframework.stereotype.Component;

@Component
public class DesignationMapping {

    private final ObjectMapper objectMapper = new ObjectMapper();

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
