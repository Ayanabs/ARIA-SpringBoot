package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.DayTypeTblDto;
import org.accimt.aria.entity.DayTypeTbl;
import org.springframework.stereotype.Component;

@Component
public class DayTypeTblMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public DayTypeTblDto toDto(DayTypeTbl entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, DayTypeTblDto.class);
    }

    public DayTypeTbl mapToEntity(DayTypeTblDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, DayTypeTbl.class);
    }
}
