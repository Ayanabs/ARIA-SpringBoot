package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrQAlDto;
import org.accimt.aria.entity.HrQAl;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HrQAlMapping {

    private final ObjectMapper objectMapper;
    public HrQAlDto toDto(HrQAl entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrQAlDto.class);
    }

    public HrQAl mapToEntity(HrQAlDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrQAl.class);
    }
}
