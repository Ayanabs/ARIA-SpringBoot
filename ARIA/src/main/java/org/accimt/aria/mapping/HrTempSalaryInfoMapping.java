package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrTempSalaryInfoDto;
import org.accimt.aria.entity.HrTempSalaryInfo;
import org.springframework.stereotype.Component;

@Component
public class HrTempSalaryInfoMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public HrTempSalaryInfoDto toDto(HrTempSalaryInfo entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrTempSalaryInfoDto.class);
    }

    public HrTempSalaryInfo mapToEntity(HrTempSalaryInfoDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrTempSalaryInfo.class);
    }
}
