package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.LvHeadTblPrDto;
import org.accimt.aria.entity.LvHeadTblPr;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LvHeadTblPrMapping {

    private final ObjectMapper objectMapper;
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
