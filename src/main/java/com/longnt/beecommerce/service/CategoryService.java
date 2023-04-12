package com.longnt.beecommerce.service;

import com.longnt.beecommerce.model.categories.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Category findCategoryById(Long id);
    Category findCategoryByName(String name);
    Category saveCategory(Category category);
    void deleteCategory(Long id);
}
