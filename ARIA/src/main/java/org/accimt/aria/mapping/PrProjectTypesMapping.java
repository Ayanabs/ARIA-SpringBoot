package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.PrProjectTypesDto;
import org.accimt.aria.entity.PrProjectTypes;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PrProjectTypesMapping {

    private final ObjectMapper objectMapper;
    public PrProjectTypesDto toDto(PrProjectTypes entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, PrProjectTypesDto.class);
    }

    public PrProjectTypes mapToEntity(PrProjectTypesDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, PrProjectTypes.class);
    }
}
