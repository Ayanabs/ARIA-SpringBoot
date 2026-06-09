package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrSalaryDetailsDto;
import org.accimt.aria.entity.HrSalaryDetails;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HrSalaryDetailsMapping {

    private final ObjectMapper objectMapper;
    public HrSalaryDetailsDto toDto(HrSalaryDetails entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrSalaryDetailsDto.class);
    }

    public HrSalaryDetails mapToEntity(HrSalaryDetailsDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrSalaryDetails.class);
    }
}
