package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrSalaryTblDto;
import org.accimt.aria.entity.HrSalaryTbl;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HrSalaryTblMapping {

    private final ObjectMapper objectMapper;
    public HrSalaryTblDto toDto(HrSalaryTbl entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrSalaryTblDto.class);
    }

    public HrSalaryTbl mapToEntity(HrSalaryTblDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrSalaryTbl.class);
    }
}
