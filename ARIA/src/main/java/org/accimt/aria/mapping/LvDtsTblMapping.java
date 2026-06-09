package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.LvDtsTblDto;
import org.accimt.aria.entity.LvDtsTbl;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LvDtsTblMapping {

    private final ObjectMapper objectMapper;
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
