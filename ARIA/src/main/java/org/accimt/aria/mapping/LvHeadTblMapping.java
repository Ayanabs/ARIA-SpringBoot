package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.LvHeadTblDto;
import org.accimt.aria.entity.LvHeadTbl;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LvHeadTblMapping {

    private final ObjectMapper objectMapper;
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
