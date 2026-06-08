package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.EmpLvTblDto;
import org.accimt.aria.entity.EmpLvTbl;
import org.springframework.stereotype.Component;

@Component
public class EmpLvTblMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public EmpLvTblDto toDto(EmpLvTbl entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, EmpLvTblDto.class);
    }

    public EmpLvTbl mapToEntity(EmpLvTblDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, EmpLvTbl.class);
    }
}
