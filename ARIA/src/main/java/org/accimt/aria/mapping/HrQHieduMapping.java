package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrQHieduDto;
import org.accimt.aria.entity.HrQHiedu;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HrQHieduMapping {

    private final ObjectMapper objectMapper;
    public HrQHieduDto toDto(HrQHiedu entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrQHieduDto.class);
    }

    public HrQHiedu mapToEntity(HrQHieduDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrQHiedu.class);
    }
}
