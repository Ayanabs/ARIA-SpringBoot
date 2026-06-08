package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrQAlDto;
import org.accimt.aria.entity.HrQAl;
import org.springframework.stereotype.Component;

@Component
public class HrQAlMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public HrQAlDto toDto(HrQAl entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrQAlDto.class);
    }

    public HrQAl mapToEntity(HrQAlDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrQAl.class);
    }
}
