package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrSalaryScaleDto;
import org.accimt.aria.entity.HrSalaryScale;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HrSalaryScaleMapping {

    private final ObjectMapper objectMapper;
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
