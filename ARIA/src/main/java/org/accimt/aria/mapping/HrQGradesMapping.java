package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrQGradesDto;
import org.accimt.aria.entity.HrQGrades;
import org.springframework.stereotype.Component;

@Component
public class HrQGradesMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public HrQGradesDto toDto(HrQGrades entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrQGradesDto.class);
    }

    public HrQGrades mapToEntity(HrQGradesDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrQGrades.class);
    }
}
