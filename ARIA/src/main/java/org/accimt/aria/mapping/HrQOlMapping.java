package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrQOlDto;
import org.accimt.aria.entity.HrQOl;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HrQOlMapping {

    private final ObjectMapper objectMapper;
    public HrQOlDto toDto(HrQOl entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrQOlDto.class);
    }

    public HrQOl mapToEntity(HrQOlDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrQOl.class);
    }
}
