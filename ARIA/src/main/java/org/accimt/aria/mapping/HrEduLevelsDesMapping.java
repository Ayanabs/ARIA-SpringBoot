package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrEduLevelsDesDto;
import org.accimt.aria.entity.HrEduLevelsDes;
import org.springframework.stereotype.Component;

@Component
public class HrEduLevelsDesMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

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
