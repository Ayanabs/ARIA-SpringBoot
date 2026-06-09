package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.SaLocationDto;
import org.accimt.aria.entity.SaLocation;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SaLocationMapping {

    private final ObjectMapper objectMapper;
    public SaLocationDto toDto(SaLocation entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, SaLocationDto.class);
    }

    public SaLocation mapToEntity(SaLocationDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, SaLocation.class);
    }
}
