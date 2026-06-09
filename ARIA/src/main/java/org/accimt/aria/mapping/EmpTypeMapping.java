package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.accimt.aria.dto.EmpTypeDto;
import org.accimt.aria.entity.EmpType;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmpTypeMapping {

    private final ObjectMapper objectMapper;
    public EmpTypeDto toDto(EmpType entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, EmpTypeDto.class);
    }

    public EmpType mapToEntity(EmpTypeDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, EmpType.class);
    }
}
