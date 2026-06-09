package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrStoresTblDto;
import org.accimt.aria.entity.HrStoresTbl;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HrStoresTblMapping {

    private final ObjectMapper objectMapper;
    public HrStoresTblDto toDto(HrStoresTbl entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrStoresTblDto.class);
    }

    public HrStoresTbl mapToEntity(HrStoresTblDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrStoresTbl.class);
    }
}
