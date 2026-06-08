package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.ComDivisionDto;
import org.accimt.aria.entity.ComDivision;
import org.springframework.stereotype.Component;

@Component
public class ComDivisionMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public ComDivisionDto toDto(ComDivision entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, ComDivisionDto.class);
    }

    public ComDivision mapToEntity(ComDivisionDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, ComDivision.class);
    }
}
