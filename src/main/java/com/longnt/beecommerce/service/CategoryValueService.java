package com.longnt.beecommerce.service;

import com.longnt.beecommerce.model.categories.CategoryValue;

import java.util.List;

public interface CategoryValueService {
    List<CategoryValue> findAll();
    CategoryValue save(CategoryValue categoryValue);
    CategoryValue findById(Long id);
}
