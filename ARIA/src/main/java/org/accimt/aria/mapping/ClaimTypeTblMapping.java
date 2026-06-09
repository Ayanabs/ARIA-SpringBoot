package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.ClaimTypeTblDto;
import org.accimt.aria.entity.ClaimTypeTbl;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ClaimTypeTblMapping {

    private final ObjectMapper objectMapper;
    public ClaimTypeTblDto toDto(ClaimTypeTbl entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, ClaimTypeTblDto.class);
    }

    public ClaimTypeTbl mapToEntity(ClaimTypeTblDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, ClaimTypeTbl.class);
    }
}
