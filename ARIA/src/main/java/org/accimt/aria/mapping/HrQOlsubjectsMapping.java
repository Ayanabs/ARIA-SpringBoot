package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrQOlsubjectsDto;
import org.accimt.aria.entity.HrQOlsubjects;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HrQOlsubjectsMapping {

    private final ObjectMapper objectMapper;
    public HrQOlsubjectsDto toDto(HrQOlsubjects entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrQOlsubjectsDto.class);
    }

    public HrQOlsubjects mapToEntity(HrQOlsubjectsDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrQOlsubjects.class);
    }
}
