package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrQExperianceDto;
import org.accimt.aria.entity.HrQExperiance;
import org.springframework.stereotype.Component;

@Component
public class HrQExperianceMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public HrQExperianceDto toDto(HrQExperiance entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrQExperianceDto.class);
    }

    public HrQExperiance mapToEntity(HrQExperianceDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrQExperiance.class);
    }
}
