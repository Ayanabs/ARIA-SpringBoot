package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.PrDenyProjectsDto;
import org.accimt.aria.entity.PrDenyProjects;
import org.springframework.stereotype.Component;

@Component
public class PrDenyProjectsMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public PrDenyProjectsDto toDto(PrDenyProjects entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, PrDenyProjectsDto.class);
    }

    public PrDenyProjects mapToEntity(PrDenyProjectsDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, PrDenyProjects.class);
    }
}
