package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrStoresTblDto;
import org.accimt.aria.entity.HrStoresTbl;
import org.springframework.stereotype.Component;

@Component
public class HrStoresTblMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public HrStoresTblDto toDto(HrStoresTbl entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrStoresTblDto.class);
    }

    public HrStoresTbl mapToEntity(HrStoresTblDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrStoresTbl.class);
    }
}
