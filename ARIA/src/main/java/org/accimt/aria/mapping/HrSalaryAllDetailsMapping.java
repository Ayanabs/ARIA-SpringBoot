package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrSalaryAllDetailsDto;
import org.accimt.aria.entity.HrSalaryAllDetails;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HrSalaryAllDetailsMapping {

    private final ObjectMapper objectMapper;
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
