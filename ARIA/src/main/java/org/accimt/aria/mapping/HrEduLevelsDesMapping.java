package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrEduLevelsDesDto;
import org.accimt.aria.entity.HrEduLevelsDes;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HrEduLevelsDesMapping {

    private final ObjectMapper objectMapper;
    public HrEduLevelsDesDto toDto(HrEduLevelsDes entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrEduLevelsDesDto.class);
    }

    public HrEduLevelsDes mapToEntity(HrEduLevelsDesDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrEduLevelsDes.class);
    }
}
