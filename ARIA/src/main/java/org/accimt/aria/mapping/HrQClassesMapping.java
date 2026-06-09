package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrQClassesDto;
import org.accimt.aria.entity.HrQClasses;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HrQClassesMapping {

    private final ObjectMapper objectMapper;
    public HrQClassesDto toDto(HrQClasses entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrQClassesDto.class);
    }

    public HrQClasses mapToEntity(HrQClassesDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrQClasses.class);
    }
}
