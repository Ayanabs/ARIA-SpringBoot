package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.PrStoresTblDto;
import org.accimt.aria.entity.PrStoresTbl;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PrStoresTblMapping {

    private final ObjectMapper objectMapper;
    public PrStoresTblDto toDto(PrStoresTbl entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, PrStoresTblDto.class);
    }

    public PrStoresTbl mapToEntity(PrStoresTblDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, PrStoresTbl.class);
    }
}
