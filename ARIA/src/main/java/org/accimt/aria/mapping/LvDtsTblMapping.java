package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.LvDtsTblDto;
import org.accimt.aria.entity.LvDtsTbl;
import org.springframework.stereotype.Component;

@Component
public class LvDtsTblMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public LvDtsTblDto toDto(LvDtsTbl entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, LvDtsTblDto.class);
    }

    public LvDtsTbl mapToEntity(LvDtsTblDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, LvDtsTbl.class);
    }
}
