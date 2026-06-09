package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrSalaryScaleDetailsDto;
import org.accimt.aria.entity.HrSalaryScaleDetails;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HrSalaryScaleDetailsMapping {

    private final ObjectMapper objectMapper;
    public HrSalaryScaleDetailsDto toDto(HrSalaryScaleDetails entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrSalaryScaleDetailsDto.class);
    }

    public HrSalaryScaleDetails mapToEntity(HrSalaryScaleDetailsDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrSalaryScaleDetails.class);
    }
}
