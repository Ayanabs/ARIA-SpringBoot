package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrOfficialDetailsDto;
import org.accimt.aria.entity.HrOfficialDetails;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HrOfficialDetailsMapping {

    private final ObjectMapper objectMapper;
    public HrOfficialDetailsDto toDto(HrOfficialDetails entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrOfficialDetailsDto.class);
    }

    public HrOfficialDetails mapToEntity(HrOfficialDetailsDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrOfficialDetails.class);
    }
}
