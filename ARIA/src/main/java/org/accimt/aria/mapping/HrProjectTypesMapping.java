package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrProjectTypesDto;
import org.accimt.aria.entity.HrProjectTypes;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HrProjectTypesMapping {

    private final ObjectMapper objectMapper;
    public HrProjectTypesDto toDto(HrProjectTypes entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrProjectTypesDto.class);
    }

    public HrProjectTypes mapToEntity(HrProjectTypesDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrProjectTypes.class);
    }
}
