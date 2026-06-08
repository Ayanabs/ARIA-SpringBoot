package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrQInstitutesDto;
import org.accimt.aria.entity.HrQInstitutes;
import org.springframework.stereotype.Component;

@Component
public class HrQInstitutesMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public HrQInstitutesDto toDto(HrQInstitutes entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrQInstitutesDto.class);
    }

    public HrQInstitutes mapToEntity(HrQInstitutesDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrQInstitutes.class);
    }
}
