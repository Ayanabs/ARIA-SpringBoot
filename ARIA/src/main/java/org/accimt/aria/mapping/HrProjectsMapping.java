package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrProjectsDto;
import org.accimt.aria.entity.HrProjects;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HrProjectsMapping {

    private final ObjectMapper objectMapper;
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
