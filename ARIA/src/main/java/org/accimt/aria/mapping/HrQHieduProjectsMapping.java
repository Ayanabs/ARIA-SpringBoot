package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrQHieduProjectsDto;
import org.accimt.aria.entity.HrQHieduProjects;
import org.springframework.stereotype.Component;

@Component
public class HrQHieduProjectsMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

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
