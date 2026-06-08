package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.accimt.aria.dto.HrEduLevelsDto;
import org.accimt.aria.entity.HrEduLevels;
import org.springframework.stereotype.Component;

@Component
public class HrEduLevelsMapping {

    private final ObjectMapper objectMapper = new ObjectMapper();

    public HrEduLevelsDto toDto(HrEduLevels entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrEduLevelsDto.class);
    }

    public HrEduLevels mapToEntity(HrEduLevelsDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrEduLevels.class);
    }
}
