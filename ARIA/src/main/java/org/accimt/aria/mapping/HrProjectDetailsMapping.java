package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrProjectDetailsDto;
import org.accimt.aria.entity.HrProjectDetails;
import org.springframework.stereotype.Component;

@Component
public class HrProjectDetailsMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public HrProjectDetailsDto toDto(HrProjectDetails entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrProjectDetailsDto.class);
    }

    public HrProjectDetails mapToEntity(HrProjectDetailsDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrProjectDetails.class);
    }
}
