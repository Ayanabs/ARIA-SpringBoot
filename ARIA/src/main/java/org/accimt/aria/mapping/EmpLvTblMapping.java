package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.EmpLvTblDto;
import org.accimt.aria.entity.EmpLvTbl;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmpLvTblMapping {

    private final ObjectMapper objectMapper;
    public EmpLvTblDto toDto(EmpLvTbl entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, EmpLvTblDto.class);
    }

    public EmpLvTbl mapToEntity(EmpLvTblDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, EmpLvTbl.class);
    }
}
