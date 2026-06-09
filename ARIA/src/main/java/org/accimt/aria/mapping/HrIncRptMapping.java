package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrIncRptDto;
import org.accimt.aria.entity.HrIncRpt;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HrIncRptMapping {

    private final ObjectMapper objectMapper;
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
