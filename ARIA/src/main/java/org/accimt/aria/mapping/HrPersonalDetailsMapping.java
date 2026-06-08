package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrPersonalDetailsDto;
import org.accimt.aria.entity.HrPersonalDetails;
import org.springframework.stereotype.Component;

@Component
public class HrPersonalDetailsMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public HrPersonalDetailsDto toDto(HrPersonalDetails entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrPersonalDetailsDto.class);
    }

    public HrPersonalDetails mapToEntity(HrPersonalDetailsDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrPersonalDetails.class);
    }
}
