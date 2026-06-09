package org.accimt.aria.mapping;

import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.accimt.aria.dto.CategoryDto;
import org.accimt.aria.entity.Category;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CategoryMapping {

    private final ObjectMapper objectMapper;
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
