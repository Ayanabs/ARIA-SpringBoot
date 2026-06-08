package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.PrProjectTypesDto;
import org.accimt.aria.entity.PrProjectTypes;
import org.springframework.stereotype.Component;

@Component
public class PrProjectTypesMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

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
