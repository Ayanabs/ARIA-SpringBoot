package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrSalaryAllDetailsDto;
import org.accimt.aria.entity.HrSalaryAllDetails;
import org.springframework.stereotype.Component;

@Component
public class HrSalaryAllDetailsMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public HrSalaryAllDetailsDto toDto(HrSalaryAllDetails entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrSalaryAllDetailsDto.class);
    }

    public HrSalaryAllDetails mapToEntity(HrSalaryAllDetailsDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrSalaryAllDetails.class);
    }
}
