package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.PrClosedDto;
import org.accimt.aria.entity.PrClosed;
import org.springframework.stereotype.Component;

@Component
public class PrClosedMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

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
