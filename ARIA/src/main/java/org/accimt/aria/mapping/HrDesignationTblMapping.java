package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.accimt.aria.dto.HrDesignationTblDto;
import org.accimt.aria.entity.HrDesignationTbl;
import org.springframework.stereotype.Component;

@Component
public class HrDesignationTblMapping {

    private final ObjectMapper objectMapper = new ObjectMapper();

    public HrDesignationTblDto toDto(HrDesignationTbl entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrDesignationTblDto.class);
    }

    public HrDesignationTbl mapToEntity(HrDesignationTblDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrDesignationTbl.class);
    }
}
