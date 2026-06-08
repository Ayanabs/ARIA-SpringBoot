package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.EmpCleaningDto;
import org.accimt.aria.entity.EmpCleaning;
import org.springframework.stereotype.Component;

@Component
public class EmpCleaningMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

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
