package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.accimt.aria.dto.HrDesigCadreDto;
import org.accimt.aria.entity.HrDesigCadre;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HrDesigCadreMapping {

    private final ObjectMapper objectMapper;
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
