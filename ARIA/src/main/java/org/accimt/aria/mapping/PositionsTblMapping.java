package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.PositionsTblDto;
import org.accimt.aria.entity.PositionsTbl;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PositionsTblMapping {

    private final ObjectMapper objectMapper;
    public PositionsTblDto toDto(PositionsTbl entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, PositionsTblDto.class);
    }

    public PositionsTbl mapToEntity(PositionsTblDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, PositionsTbl.class);
    }
}
