package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.PrExtendDto;
import org.accimt.aria.entity.PrExtend;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PrExtendMapping {

    private final ObjectMapper objectMapper;
    public PrExtendDto toDto(PrExtend entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, PrExtendDto.class);
    }

    public PrExtend mapToEntity(PrExtendDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, PrExtend.class);
    }
}
