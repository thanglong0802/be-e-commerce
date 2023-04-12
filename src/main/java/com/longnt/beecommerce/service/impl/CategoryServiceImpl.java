package com.longnt.beecommerce.service.impl;

import com.longnt.beecommerce.model.categories.Category;
import com.longnt.beecommerce.repository.CategoryRepository;
import com.longnt.beecommerce.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findCategoryById(Long id) {
        return categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Khong tim thay"));
    }

    @Override
    public Category findCategoryByName(String name) {
        return categoryRepository.findByNameCategory(name);
    }

    @Override
    public Category saveCategory(Category category) {
        System.out.println(category);
        return categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
