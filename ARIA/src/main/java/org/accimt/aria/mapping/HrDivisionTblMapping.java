package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.accimt.aria.dto.HrDivisionTblDto;
import org.accimt.aria.entity.HrDivisionTbl;
import org.springframework.stereotype.Component;

@Component
public class HrDivisionTblMapping {

    private final ObjectMapper objectMapper = new ObjectMapper();

    public HrDivisionTblDto toDto(HrDivisionTbl entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrDivisionTblDto.class);
    }

    public HrDivisionTbl mapToEntity(HrDivisionTblDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrDivisionTbl.class);
    }
}
