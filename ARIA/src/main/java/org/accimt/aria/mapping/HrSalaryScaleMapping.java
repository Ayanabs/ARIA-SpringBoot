package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrSalaryScaleDto;
import org.accimt.aria.entity.HrSalaryScale;
import org.springframework.stereotype.Component;

@Component
public class HrSalaryScaleMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public HrSalaryScaleDto toDto(HrSalaryScale entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrSalaryScaleDto.class);
    }

    public HrSalaryScale mapToEntity(HrSalaryScaleDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrSalaryScale.class);
    }
}
