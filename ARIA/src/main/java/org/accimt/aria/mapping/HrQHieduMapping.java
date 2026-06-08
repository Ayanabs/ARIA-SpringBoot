package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrQHieduDto;
import org.accimt.aria.entity.HrQHiedu;
import org.springframework.stereotype.Component;

@Component
public class HrQHieduMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public HrQHieduDto toDto(HrQHiedu entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrQHieduDto.class);
    }

    public HrQHiedu mapToEntity(HrQHieduDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrQHiedu.class);
    }
}
