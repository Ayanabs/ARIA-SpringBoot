package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.EmpSlvTblDto;
import org.accimt.aria.entity.EmpSlvTbl;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmpSlvTblMapping {

    private final ObjectMapper objectMapper;
    public EmpSlvTblDto toDto(EmpSlvTbl entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, EmpSlvTblDto.class);
    }

    public EmpSlvTbl mapToEntity(EmpSlvTblDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, EmpSlvTbl.class);
    }
}
