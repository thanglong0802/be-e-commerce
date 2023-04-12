package com.longnt.beecommerce.service;

import com.longnt.beecommerce.common.InsertForm;
import com.longnt.beecommerce.model.categories.CategoryAttribute;

import java.util.List;

public interface CategoryAttributeService {
    List<CategoryAttribute> findAll();
    CategoryAttribute findById(Long id);
    CategoryAttribute save(CategoryAttribute categoryAttribute);
    CategoryAttribute findByNameCategoryAttribute(String name);
    InsertForm createCategoryAttribute(InsertForm form);
}
