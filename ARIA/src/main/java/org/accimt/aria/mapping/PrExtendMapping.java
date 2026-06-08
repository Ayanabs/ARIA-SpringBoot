package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.PrExtendDto;
import org.accimt.aria.entity.PrExtend;
import org.springframework.stereotype.Component;

@Component
public class PrExtendMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public PrExtendDto toDto(PrExtend entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, PrExtendDto.class);
    }

    public PrExtend mapToEntity(PrExtendDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, PrExtend.class);
    }
}
