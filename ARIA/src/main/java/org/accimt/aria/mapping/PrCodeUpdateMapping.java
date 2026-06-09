package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.PrCodeUpdateDto;
import org.accimt.aria.entity.PrCodeUpdate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PrCodeUpdateMapping {

    private final ObjectMapper objectMapper;
    public PrCodeUpdateDto toDto(PrCodeUpdate entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, PrCodeUpdateDto.class);
    }

    public PrCodeUpdate mapToEntity(PrCodeUpdateDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, PrCodeUpdate.class);
    }
}
