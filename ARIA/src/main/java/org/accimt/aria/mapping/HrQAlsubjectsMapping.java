package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrQAlsubjectsDto;
import org.accimt.aria.entity.HrQAlsubjects;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HrQAlsubjectsMapping {

    private final ObjectMapper objectMapper;
    public HrQAlsubjectsDto toDto(HrQAlsubjects entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrQAlsubjectsDto.class);
    }

    public HrQAlsubjects mapToEntity(HrQAlsubjectsDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrQAlsubjects.class);
    }
}
