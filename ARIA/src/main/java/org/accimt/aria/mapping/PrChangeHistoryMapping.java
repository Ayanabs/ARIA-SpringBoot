package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.PrChangeHistoryDto;
import org.accimt.aria.entity.PrChangeHistory;
import org.springframework.stereotype.Component;

@Component
public class PrChangeHistoryMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

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
