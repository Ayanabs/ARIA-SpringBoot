package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.PrProjectTypes2Dto;
import org.accimt.aria.entity.PrProjectTypes2;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PrProjectTypes2Mapping {

    private final ObjectMapper objectMapper;
    public PrProjectTypes2Dto toDto(PrProjectTypes2 entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, PrProjectTypes2Dto.class);
    }

    public PrProjectTypes2 mapToEntity(PrProjectTypes2Dto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, PrProjectTypes2.class);
    }
}
