package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.IncompleteSourceTblDto;
import org.accimt.aria.entity.IncompleteSourceTbl;
import org.springframework.stereotype.Component;

@Component
public class IncompleteSourceTblMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public IncompleteSourceTblDto toDto(IncompleteSourceTbl entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, IncompleteSourceTblDto.class);
    }

    public IncompleteSourceTbl mapToEntity(IncompleteSourceTblDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, IncompleteSourceTbl.class);
    }
}
