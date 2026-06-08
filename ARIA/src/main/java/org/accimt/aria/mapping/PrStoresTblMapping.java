package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.PrStoresTblDto;
import org.accimt.aria.entity.PrStoresTbl;
import org.springframework.stereotype.Component;

@Component
public class PrStoresTblMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

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
