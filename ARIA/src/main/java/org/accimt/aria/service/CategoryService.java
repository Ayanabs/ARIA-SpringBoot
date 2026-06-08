package org.accimt.aria.service;

import org.accimt.aria.dto.CategoryDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {

    CategoryDto getCategoryById(Integer id);
    List<CategoryDto> getAllCategories();

}
