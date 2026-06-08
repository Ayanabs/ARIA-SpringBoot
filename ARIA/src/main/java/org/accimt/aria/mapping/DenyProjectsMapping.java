package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.DenyProjectsDto;
import org.accimt.aria.entity.DenyProjects;
import org.springframework.stereotype.Component;

@Component
public class DenyProjectsMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public DenyProjectsDto toDto(DenyProjects entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, DenyProjectsDto.class);
    }

    public DenyProjects mapToEntity(DenyProjectsDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, DenyProjects.class);
    }
}
