package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrIncRptDto;
import org.accimt.aria.entity.HrIncRpt;
import org.springframework.stereotype.Component;

@Component
public class HrIncRptMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public HrIncRptDto toDto(HrIncRpt entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrIncRptDto.class);
    }

    public HrIncRpt mapToEntity(HrIncRptDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrIncRpt.class);
    }
}
