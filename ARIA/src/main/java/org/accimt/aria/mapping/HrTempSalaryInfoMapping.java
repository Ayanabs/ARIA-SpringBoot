package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrTempSalaryInfoDto;
import org.accimt.aria.entity.HrTempSalaryInfo;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HrTempSalaryInfoMapping {

    private final ObjectMapper objectMapper;
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
