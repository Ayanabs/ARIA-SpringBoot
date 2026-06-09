package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrQHieduProjectsDto;
import org.accimt.aria.entity.HrQHieduProjects;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HrQHieduProjectsMapping {

    private final ObjectMapper objectMapper;
    public HrQHieduProjectsDto toDto(HrQHieduProjects entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrQHieduProjectsDto.class);
    }

    public HrQHieduProjects mapToEntity(HrQHieduProjectsDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrQHieduProjects.class);
    }
}
