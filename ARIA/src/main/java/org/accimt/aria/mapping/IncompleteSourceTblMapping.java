package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.IncompleteSourceTblDto;
import org.accimt.aria.entity.IncompleteSourceTbl;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class IncompleteSourceTblMapping {

    private final ObjectMapper objectMapper;
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
