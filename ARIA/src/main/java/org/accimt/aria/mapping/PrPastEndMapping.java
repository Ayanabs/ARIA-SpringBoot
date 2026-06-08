package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.PrPastEndDto;
import org.accimt.aria.entity.PrPastEnd;
import org.springframework.stereotype.Component;

@Component
public class PrPastEndMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public PrPastEndDto toDto(PrPastEnd entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, PrPastEndDto.class);
    }

    public PrPastEnd mapToEntity(PrPastEndDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, PrPastEnd.class);
    }
}
