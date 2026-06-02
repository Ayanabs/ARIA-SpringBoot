package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.accimt.aria.dto.DivisionDto;
import org.accimt.aria.entity.Division;
import org.springframework.stereotype.Component;

@Component
public class DivisionMapping {

    private final ObjectMapper objectMapper = new ObjectMapper();

    public DivisionDto toDto(Division entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, DivisionDto.class);
    }

    public Division mapToEntity(DivisionDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, Division.class);
    }
}
