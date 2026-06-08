package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.PrDenyClosedprjDto;
import org.accimt.aria.entity.PrDenyClosedprj;
import org.springframework.stereotype.Component;

@Component
public class PrDenyClosedprjMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public PrDenyClosedprjDto toDto(PrDenyClosedprj entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, PrDenyClosedprjDto.class);
    }

    public PrDenyClosedprj mapToEntity(PrDenyClosedprjDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, PrDenyClosedprj.class);
    }
}
