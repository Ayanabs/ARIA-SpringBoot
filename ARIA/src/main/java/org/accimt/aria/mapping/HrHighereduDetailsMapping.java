package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrHighereduDetailsDto;
import org.accimt.aria.entity.HrHighereduDetails;
import org.springframework.stereotype.Component;

@Component
public class HrHighereduDetailsMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public HrHighereduDetailsDto toDto(HrHighereduDetails entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrHighereduDetailsDto.class);
    }

    public HrHighereduDetails mapToEntity(HrHighereduDetailsDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrHighereduDetails.class);
    }
}
