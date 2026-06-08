package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.DivBudgTblDto;
import org.accimt.aria.entity.DivBudgTbl;
import org.springframework.stereotype.Component;

@Component
public class DivBudgTblMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public DivBudgTblDto toDto(DivBudgTbl entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, DivBudgTblDto.class);
    }

    public DivBudgTbl mapToEntity(DivBudgTblDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, DivBudgTbl.class);
    }
}
