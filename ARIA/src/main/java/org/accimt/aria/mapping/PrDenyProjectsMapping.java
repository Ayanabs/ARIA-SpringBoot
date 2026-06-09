package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.PrDenyProjectsDto;
import org.accimt.aria.entity.PrDenyProjects;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PrDenyProjectsMapping {

    private final ObjectMapper objectMapper;
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
