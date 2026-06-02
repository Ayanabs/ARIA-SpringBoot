package org.accimt.aria.service.ai;

import dev.langchain4j.agent.tool.Tool;
import dev.langchain4j.agent.tool.P;
import org.accimt.aria.service.CategoryService;
import org.springframework.stereotype.Component;

@Component
public class CategoryTools {

    private final CategoryService categoryService;

    public CategoryTools(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Tool("Fetches details of all categories from the database (maps to /api/categories)")
    public Object fetchAllCategories() {
        RoutingContext.addEndpoint("/api/categories");
        return categoryService.getAllCategories();
    }

    @Tool("Fetches details of a specific category by its unique ID (maps to /api/categories/{id})")
    public Object fetchCategoryById(@P("The unique numeric ID of the category") Integer id) {
        RoutingContext.addEndpoint("/api/categories/" + id);
        return categoryService.getCategoryById(id);
    }
}
