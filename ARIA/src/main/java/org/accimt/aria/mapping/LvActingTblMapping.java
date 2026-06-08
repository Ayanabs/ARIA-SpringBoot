package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.LvActingTblDto;
import org.accimt.aria.entity.LvActingTbl;
import org.springframework.stereotype.Component;

@Component
public class LvActingTblMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public LvActingTblDto toDto(LvActingTbl entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, LvActingTblDto.class);
    }

    public LvActingTbl mapToEntity(LvActingTblDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, LvActingTbl.class);
    }
}
