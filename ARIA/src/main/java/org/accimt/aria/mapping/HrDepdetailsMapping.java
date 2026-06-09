package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.HrDepdetailsDto;
import org.accimt.aria.entity.HrDepdetails;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HrDepdetailsMapping {

    private final ObjectMapper objectMapper;
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
