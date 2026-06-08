package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrOfficialDetailsDto;
import org.accimt.aria.entity.HrOfficialDetails;
import org.springframework.stereotype.Component;

@Component
public class HrOfficialDetailsMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public HrOfficialDetailsDto toDto(HrOfficialDetails entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrOfficialDetailsDto.class);
    }

    public HrOfficialDetails mapToEntity(HrOfficialDetailsDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrOfficialDetails.class);
    }
}
