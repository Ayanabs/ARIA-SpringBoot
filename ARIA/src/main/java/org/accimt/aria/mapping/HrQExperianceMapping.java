package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrQExperianceDto;
import org.accimt.aria.entity.HrQExperiance;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HrQExperianceMapping {

    private final ObjectMapper objectMapper;
    public HrQExperianceDto toDto(HrQExperiance entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrQExperianceDto.class);
    }

    public HrQExperiance mapToEntity(HrQExperianceDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrQExperiance.class);
    }
}
