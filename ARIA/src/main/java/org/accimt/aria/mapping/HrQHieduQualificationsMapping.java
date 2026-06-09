package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrQHieduQualificationsDto;
import org.accimt.aria.entity.HrQHieduQualifications;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HrQHieduQualificationsMapping {

    private final ObjectMapper objectMapper;
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
