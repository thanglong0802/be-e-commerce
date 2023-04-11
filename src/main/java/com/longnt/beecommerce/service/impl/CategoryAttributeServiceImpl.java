package com.longnt.beecommerce.service.impl;

import com.longnt.beecommerce.model.categories.CategoryAttribute;
import com.longnt.beecommerce.repository.CategoryAttributeRepository;
import com.longnt.beecommerce.service.CategoryAttributeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryAttributeServiceImpl implements CategoryAttributeService {
    private final CategoryAttributeRepository categoryAttributeRepository;

    public CategoryAttributeServiceImpl(CategoryAttributeRepository categoryAttributeRepository) {
        this.categoryAttributeRepository = categoryAttributeRepository;
    }

    @Override
    public List<CategoryAttribute> findAll() {
        return categoryAttributeRepository.findAll();
    }

    @Override
    public CategoryAttribute save(CategoryAttribute categoryAttribute) {
        return categoryAttributeRepository.save(categoryAttribute);
    }

    @Override
    public CategoryAttribute findById(Long id) {
        return categoryAttributeRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
    }

    @Override
    public CategoryAttribute findByNameCategoryAttribute(String name) {
        CategoryAttribute attribute = categoryAttributeRepository.findByNameCategoryAttribute(name);
        return attribute;
    }
}
