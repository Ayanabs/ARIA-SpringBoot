package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.PrProjectApcodeDto;
import org.accimt.aria.entity.PrProjectApcode;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PrProjectApcodeMapping {

    private final ObjectMapper objectMapper;
    public PrProjectApcodeDto toDto(PrProjectApcode entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, PrProjectApcodeDto.class);
    }

    public PrProjectApcode mapToEntity(PrProjectApcodeDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, PrProjectApcode.class);
    }
}
