package org.accimt.aria.mapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.CategoryDto;
import org.accimt.aria.entity.Category;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapping {

    private final ObjectMapper objectMapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    public CategoryDto toDto(Category entity) {
        if (entity == null) {
            return null;
        }
        return objectMapper.convertValue(entity, CategoryDto.class);
    }

    public Category mapToEntity(CategoryDto dto) {
        if (dto == null) {
            return null;
        }
        return objectMapper.convertValue(dto, Category.class);
    }
}
