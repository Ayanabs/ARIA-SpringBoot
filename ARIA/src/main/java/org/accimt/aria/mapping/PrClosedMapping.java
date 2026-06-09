package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.PrClosedDto;
import org.accimt.aria.entity.PrClosed;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PrClosedMapping {

    private final ObjectMapper objectMapper;
    public PrClosedDto toDto(PrClosed entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, PrClosedDto.class);
    }

    public PrClosed mapToEntity(PrClosedDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, PrClosed.class);
    }
}
