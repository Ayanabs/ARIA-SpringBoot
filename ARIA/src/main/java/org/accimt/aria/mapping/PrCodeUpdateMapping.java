package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.PrCodeUpdateDto;
import org.accimt.aria.entity.PrCodeUpdate;
import org.springframework.stereotype.Component;

@Component
public class PrCodeUpdateMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public PrCodeUpdateDto toDto(PrCodeUpdate entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, PrCodeUpdateDto.class);
    }

    public PrCodeUpdate mapToEntity(PrCodeUpdateDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, PrCodeUpdate.class);
    }
}
