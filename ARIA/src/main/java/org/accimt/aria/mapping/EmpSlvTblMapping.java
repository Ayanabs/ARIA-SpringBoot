package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.EmpSlvTblDto;
import org.accimt.aria.entity.EmpSlvTbl;
import org.springframework.stereotype.Component;

@Component
public class EmpSlvTblMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public EmpSlvTblDto toDto(EmpSlvTbl entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, EmpSlvTblDto.class);
    }

    public EmpSlvTbl mapToEntity(EmpSlvTblDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, EmpSlvTbl.class);
    }
}
