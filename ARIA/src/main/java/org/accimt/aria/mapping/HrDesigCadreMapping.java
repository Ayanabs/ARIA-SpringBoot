package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.accimt.aria.dto.HrDesigCadreDto;
import org.accimt.aria.entity.HrDesigCadre;
import org.springframework.stereotype.Component;

@Component
public class HrDesigCadreMapping {

    private final ObjectMapper objectMapper = new ObjectMapper();

    public HrDesigCadreDto toDto(HrDesigCadre entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrDesigCadreDto.class);
    }

    public HrDesigCadre mapToEntity(HrDesigCadreDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrDesigCadre.class);
    }
}
