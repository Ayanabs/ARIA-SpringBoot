package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.ClaimTypeTblDto;
import org.accimt.aria.entity.ClaimTypeTbl;
import org.springframework.stereotype.Component;

@Component
public class ClaimTypeTblMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public ClaimTypeTblDto toDto(ClaimTypeTbl entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, ClaimTypeTblDto.class);
    }

    public ClaimTypeTbl mapToEntity(ClaimTypeTblDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, ClaimTypeTbl.class);
    }
}
