package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrQClassesDto;
import org.accimt.aria.entity.HrQClasses;
import org.springframework.stereotype.Component;

@Component
public class HrQClassesMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public HrQClassesDto toDto(HrQClasses entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrQClassesDto.class);
    }

    public HrQClasses mapToEntity(HrQClassesDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrQClasses.class);
    }
}
