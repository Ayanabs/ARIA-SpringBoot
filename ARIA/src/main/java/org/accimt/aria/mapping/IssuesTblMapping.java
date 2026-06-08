package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.IssuesTblDto;
import org.accimt.aria.entity.IssuesTbl;
import org.springframework.stereotype.Component;

@Component
public class IssuesTblMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public IssuesTblDto toDto(IssuesTbl entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, IssuesTblDto.class);
    }

    public IssuesTbl mapToEntity(IssuesTblDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, IssuesTbl.class);
    }
}
