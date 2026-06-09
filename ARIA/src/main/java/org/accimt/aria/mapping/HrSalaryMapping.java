package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.accimt.aria.dto.HrSalaryDto;
import org.accimt.aria.entity.HrSalary;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HrSalaryMapping {

    private final ObjectMapper objectMapper;
    public HrSalaryDto toDto(HrSalary entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrSalaryDto.class);
    }

    public HrSalary mapToEntity(HrSalaryDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrSalary.class);
    }
}
