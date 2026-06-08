package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.SaLocationDto;
import org.accimt.aria.entity.SaLocation;
import org.springframework.stereotype.Component;

@Component
public class SaLocationMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public SaLocationDto toDto(SaLocation entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, SaLocationDto.class);
    }

    public SaLocation mapToEntity(SaLocationDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, SaLocation.class);
    }
}
