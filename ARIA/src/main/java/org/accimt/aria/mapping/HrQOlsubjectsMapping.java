package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrQOlsubjectsDto;
import org.accimt.aria.entity.HrQOlsubjects;
import org.springframework.stereotype.Component;

@Component
public class HrQOlsubjectsMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public HrQOlsubjectsDto toDto(HrQOlsubjects entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrQOlsubjectsDto.class);
    }

    public HrQOlsubjects mapToEntity(HrQOlsubjectsDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrQOlsubjects.class);
    }
}
