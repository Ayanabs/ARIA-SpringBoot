package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.accimt.aria.dto.EmpGradeDto;
import org.accimt.aria.entity.EmpGrade;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmpGradeMapping {

    private final ObjectMapper objectMapper;
    public EmpGradeDto toDto(EmpGrade entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, EmpGradeDto.class);
    }

    public EmpGrade mapToEntity(EmpGradeDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, EmpGrade.class);
    }
}
