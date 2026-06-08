package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.PrProjectApcodeDto;
import org.accimt.aria.entity.PrProjectApcode;
import org.springframework.stereotype.Component;

@Component
public class PrProjectApcodeMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public PrProjectApcodeDto toDto(PrProjectApcode entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, PrProjectApcodeDto.class);
    }

    public PrProjectApcode mapToEntity(PrProjectApcodeDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, PrProjectApcode.class);
    }
}
