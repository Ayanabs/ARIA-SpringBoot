package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.accimt.aria.dto.EmpCleaningDto;
import org.accimt.aria.entity.EmpCleaning;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmpCleaningMapping {

    private final ObjectMapper objectMapper;
    public EmpCleaningDto toDto(EmpCleaning entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, EmpCleaningDto.class);
    }

    public EmpCleaning mapToEntity(EmpCleaningDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, EmpCleaning.class);
    }
}
