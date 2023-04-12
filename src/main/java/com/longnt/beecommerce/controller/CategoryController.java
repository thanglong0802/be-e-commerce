package com.longnt.beecommerce.controller;

import com.longnt.beecommerce.model.categories.Category;
import com.longnt.beecommerce.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/")
    public List<Category> getAll() {
        return categoryService.findAll();
    }

    @PostMapping("/")
    public Category createCategory(@RequestBody Category category) {
        return categoryService.saveCategory(category);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
    }

    @PutMapping("/{id}")
    public Category updateCategory(@PathVariable Long id, @RequestBody Category category) {
        Category categoryCheckUpdate = categoryService.findCategoryById(id);
        categoryCheckUpdate.setNameCategory(category.getNameCategory());
        return categoryService.saveCategory(categoryCheckUpdate);
    }
}
