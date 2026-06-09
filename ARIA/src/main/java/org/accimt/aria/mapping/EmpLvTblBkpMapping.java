package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.accimt.aria.dto.EmpLvTblBkpDto;
import org.accimt.aria.entity.EmpLvTblBkp;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmpLvTblBkpMapping {

    private final ObjectMapper objectMapper;
    public EmpLvTblBkpDto toDto(EmpLvTblBkp entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, EmpLvTblBkpDto.class);
    }

    public EmpLvTblBkp mapToEntity(EmpLvTblBkpDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, EmpLvTblBkp.class);
    }
}
