package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.LvHeadTblPrDto;
import org.accimt.aria.entity.LvHeadTblPr;
import org.springframework.stereotype.Component;

@Component
public class LvHeadTblPrMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public LvHeadTblPrDto toDto(LvHeadTblPr entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, LvHeadTblPrDto.class);
    }

    public LvHeadTblPr mapToEntity(LvHeadTblPrDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, LvHeadTblPr.class);
    }
}
