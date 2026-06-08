package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrQOlDto;
import org.accimt.aria.entity.HrQOl;
import org.springframework.stereotype.Component;

@Component
public class HrQOlMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public HrQOlDto toDto(HrQOl entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrQOlDto.class);
    }

    public HrQOl mapToEntity(HrQOlDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrQOl.class);
    }
}
