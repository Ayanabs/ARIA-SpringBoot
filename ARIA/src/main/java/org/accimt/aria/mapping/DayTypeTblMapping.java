package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.DayTypeTblDto;
import org.accimt.aria.entity.DayTypeTbl;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DayTypeTblMapping {

    private final ObjectMapper objectMapper;
    public DayTypeTblDto toDto(DayTypeTbl entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, DayTypeTblDto.class);
    }

    public DayTypeTbl mapToEntity(DayTypeTblDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, DayTypeTbl.class);
    }
}
