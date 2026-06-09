package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.MainSubDivisionDto;
import org.accimt.aria.entity.MainSubDivision;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MainSubDivisionMapping {

    private final ObjectMapper objectMapper;
    public MainSubDivisionDto toDto(MainSubDivision entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, MainSubDivisionDto.class);
    }

    public MainSubDivision mapToEntity(MainSubDivisionDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, MainSubDivision.class);
    }
}
