package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.PrChangeHistoryDto;
import org.accimt.aria.entity.PrChangeHistory;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PrChangeHistoryMapping {

    private final ObjectMapper objectMapper;
    public PrChangeHistoryDto toDto(PrChangeHistory entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, PrChangeHistoryDto.class);
    }

    public PrChangeHistory mapToEntity(PrChangeHistoryDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, PrChangeHistory.class);
    }
}
