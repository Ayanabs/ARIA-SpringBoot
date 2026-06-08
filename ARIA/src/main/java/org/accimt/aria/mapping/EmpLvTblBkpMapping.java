package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.EmpLvTblBkpDto;
import org.accimt.aria.entity.EmpLvTblBkp;
import org.springframework.stereotype.Component;

@Component
public class EmpLvTblBkpMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public EmpLvTblBkpDto toDto(EmpLvTblBkp entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, EmpLvTblBkpDto.class);
    }

    public EmpLvTblBkp mapToEntity(EmpLvTblBkpDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, EmpLvTblBkp.class);
    }
}
