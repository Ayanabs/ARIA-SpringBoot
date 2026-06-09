package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.DivBudgTblDto;
import org.accimt.aria.entity.DivBudgTbl;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DivBudgTblMapping {

    private final ObjectMapper objectMapper;
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
