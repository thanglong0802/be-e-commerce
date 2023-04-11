package com.longnt.beecommerce.service;

import com.longnt.beecommerce.model.categories.CategoryAttribute;

import java.util.List;

public interface CategoryAttributeService {
    List<CategoryAttribute> findAll();
    CategoryAttribute save(CategoryAttribute categoryAttribute);
    CategoryAttribute findById(Long id);
    CategoryAttribute findByNameCategoryAttribute(String name);
}
