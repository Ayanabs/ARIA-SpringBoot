package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrProjectsDto;
import org.accimt.aria.entity.HrProjects;
import org.springframework.stereotype.Component;

@Component
public class HrProjectsMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public HrProjectsDto toDto(HrProjects entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrProjectsDto.class);
    }

    public HrProjects mapToEntity(HrProjectsDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrProjects.class);
    }
}
