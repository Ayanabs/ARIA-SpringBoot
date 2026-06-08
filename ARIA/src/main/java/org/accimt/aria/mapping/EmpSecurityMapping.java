package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.EmpSecurityDto;
import org.accimt.aria.entity.EmpSecurity;
import org.springframework.stereotype.Component;

@Component
public class EmpSecurityMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

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
