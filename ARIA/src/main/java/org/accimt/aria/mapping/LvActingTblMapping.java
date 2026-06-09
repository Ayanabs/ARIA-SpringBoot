package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.LvActingTblDto;
import org.accimt.aria.entity.LvActingTbl;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LvActingTblMapping {

    private final ObjectMapper objectMapper;
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
