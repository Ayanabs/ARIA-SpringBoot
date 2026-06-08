package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrProjectTypesDto;
import org.accimt.aria.entity.HrProjectTypes;
import org.springframework.stereotype.Component;

@Component
public class HrProjectTypesMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public HrProjectTypesDto toDto(HrProjectTypes entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrProjectTypesDto.class);
    }

    public HrProjectTypes mapToEntity(HrProjectTypesDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrProjectTypes.class);
    }
}
