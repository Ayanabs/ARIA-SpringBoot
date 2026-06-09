package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.ComDivisionDto;
import org.accimt.aria.entity.ComDivision;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ComDivisionMapping {

    private final ObjectMapper objectMapper;
    public ComDivisionDto toDto(ComDivision entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, ComDivisionDto.class);
    }

    public ComDivision mapToEntity(ComDivisionDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, ComDivision.class);
    }
}
