package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.PrProjectTypes2Dto;
import org.accimt.aria.entity.PrProjectTypes2;
import org.springframework.stereotype.Component;

@Component
public class PrProjectTypes2Mapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

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
