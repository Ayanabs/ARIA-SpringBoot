package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.PositionsTblDto;
import org.accimt.aria.entity.PositionsTbl;
import org.springframework.stereotype.Component;

@Component
public class PositionsTblMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public PositionsTblDto toDto(PositionsTbl entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, PositionsTblDto.class);
    }

    public PositionsTbl mapToEntity(PositionsTblDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, PositionsTbl.class);
    }
}
