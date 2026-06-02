package org.accimt.aria.service.impl;

import lombok.AllArgsConstructor;
import org.accimt.aria.dto.CategoryDto;
import org.accimt.aria.entity.Category;
import org.accimt.aria.mapping.CategoryMapping;
import org.accimt.aria.repository.CategoryRepository;
import org.accimt.aria.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryMapping categoryMapping;

    @Override
    public CategoryDto createCategory(CategoryDto dto) {
        Category entity = categoryMapping.mapToEntity(dto);
        Category savedCategory = categoryRepository.save(entity);
        return categoryMapping.toDto(savedCategory);
    }

    @Override
    public CategoryDto updateCategory(CategoryDto dto) {
        Category existingCategory = categoryRepository.findById(dto.getCategorycode())
                .orElseThrow(() -> new RuntimeException("Category not found with code: " + dto.getCategorycode()));

        if (dto.getCategory() != null) existingCategory.setCategory(dto.getCategory());
        if (dto.getIntime() != null) existingCategory.setIntime(dto.getIntime());
        if (dto.getOuttimeh() != null) existingCategory.setOuttimeh(dto.getOuttimeh());
        if (dto.getOuttimem() != null) existingCategory.setOuttimem(dto.getOuttimem());
        if (dto.getAdjesttime() != null) existingCategory.setAdjesttime(dto.getAdjesttime());
        if (dto.getLatetime() != null) existingCategory.setLatetime(dto.getLatetime());
        if (dto.getSpLatetime() != null) existingCategory.setSpLatetime(dto.getSpLatetime());

        Category updatedCategory = categoryRepository.save(existingCategory);
        return categoryMapping.toDto(updatedCategory);
    }

    @Override
    public CategoryDto getCategoryById(Integer id) {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found with code: " + id));
        return categoryMapping.toDto(category);
    }

    @Override
    public List<CategoryDto> getAllCategories() {
        return categoryRepository.findAll().stream()
                .map(categoryMapping::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteCategoryById(Integer id) {
        throw new UnsupportedOperationException("Deletions are not allowed in this project");
    }
}
