package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.LvHeadTblDto;
import org.accimt.aria.entity.LvHeadTbl;
import org.springframework.stereotype.Component;

@Component
public class LvHeadTblMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public LvHeadTblDto toDto(LvHeadTbl entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, LvHeadTblDto.class);
    }

    public LvHeadTbl mapToEntity(LvHeadTblDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, LvHeadTbl.class);
    }
}
