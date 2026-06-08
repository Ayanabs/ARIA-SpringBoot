package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.EmpGradeDto;
import org.accimt.aria.entity.EmpGrade;
import org.springframework.stereotype.Component;

@Component
public class EmpGradeMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

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
