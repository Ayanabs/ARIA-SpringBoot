package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrProjectDetailsDto;
import org.accimt.aria.entity.HrProjectDetails;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HrProjectDetailsMapping {

    private final ObjectMapper objectMapper;
    public HrProjectDetailsDto toDto(HrProjectDetails entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrProjectDetailsDto.class);
    }

    public HrProjectDetails mapToEntity(HrProjectDetailsDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrProjectDetails.class);
    }
}
