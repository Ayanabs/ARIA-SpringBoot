package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrQHieduQualificationsDto;
import org.accimt.aria.entity.HrQHieduQualifications;
import org.springframework.stereotype.Component;

@Component
public class HrQHieduQualificationsMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public HrQHieduQualificationsDto toDto(HrQHieduQualifications entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrQHieduQualificationsDto.class);
    }

    public HrQHieduQualifications mapToEntity(HrQHieduQualificationsDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrQHieduQualifications.class);
    }
}
