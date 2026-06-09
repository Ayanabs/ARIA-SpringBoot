package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.PrDenyClosedprjDto;
import org.accimt.aria.entity.PrDenyClosedprj;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PrDenyClosedprjMapping {

    private final ObjectMapper objectMapper;
    public PrDenyClosedprjDto toDto(PrDenyClosedprj entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, PrDenyClosedprjDto.class);
    }

    public PrDenyClosedprj mapToEntity(PrDenyClosedprjDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, PrDenyClosedprj.class);
    }
}
