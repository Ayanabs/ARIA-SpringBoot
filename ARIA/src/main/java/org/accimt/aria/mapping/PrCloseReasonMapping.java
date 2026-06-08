package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.PrCloseReasonDto;
import org.accimt.aria.entity.PrCloseReason;
import org.springframework.stereotype.Component;

@Component
public class PrCloseReasonMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public PrCloseReasonDto toDto(PrCloseReason entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, PrCloseReasonDto.class);
    }

    public PrCloseReason mapToEntity(PrCloseReasonDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, PrCloseReason.class);
    }
}
