package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.PrCloseReasonDto;
import org.accimt.aria.entity.PrCloseReason;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PrCloseReasonMapping {

    private final ObjectMapper objectMapper;
    public PrCloseReasonDto toDto(PrCloseReason entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, PrCloseReasonDto.class);
    }

    public PrCloseReason mapToEntity(PrCloseReasonDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, PrCloseReason.class);
    }
}
