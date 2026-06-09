package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.PrProjectsDto;
import org.accimt.aria.entity.PrProjects;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PrProjectsMapping {

    private final ObjectMapper objectMapper;
    public PrProjectsDto toDto(PrProjects entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, PrProjectsDto.class);
    }

    public PrProjects mapToEntity(PrProjectsDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, PrProjects.class);
    }
}
