package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.EmpSecurityDto;
import org.accimt.aria.entity.EmpSecurity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmpSecurityMapping {

    private final ObjectMapper objectMapper;
    public EmpSecurityDto toDto(EmpSecurity entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, EmpSecurityDto.class);
    }

    public EmpSecurity mapToEntity(EmpSecurityDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, EmpSecurity.class);
    }
}
