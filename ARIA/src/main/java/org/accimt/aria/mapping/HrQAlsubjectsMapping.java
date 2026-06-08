package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrQAlsubjectsDto;
import org.accimt.aria.entity.HrQAlsubjects;
import org.springframework.stereotype.Component;

@Component
public class HrQAlsubjectsMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public HrQAlsubjectsDto toDto(HrQAlsubjects entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrQAlsubjectsDto.class);
    }

    public HrQAlsubjects mapToEntity(HrQAlsubjectsDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrQAlsubjects.class);
    }
}
