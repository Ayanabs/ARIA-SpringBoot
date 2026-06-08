package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrDepdetailsDto;
import org.accimt.aria.entity.HrDepdetails;
import org.springframework.stereotype.Component;

@Component
public class HrDepdetailsMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public HrDepdetailsDto toDto(HrDepdetails entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, HrDepdetailsDto.class);
    }

    public HrDepdetails mapToEntity(HrDepdetailsDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, HrDepdetails.class);
    }
}
