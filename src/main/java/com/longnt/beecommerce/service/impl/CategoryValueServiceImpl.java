package com.longnt.beecommerce.service.impl;

import com.longnt.beecommerce.model.categories.CategoryValue;
import com.longnt.beecommerce.repository.CategoryValueRepository;
import com.longnt.beecommerce.service.CategoryValueService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryValueServiceImpl implements CategoryValueService {
    private final CategoryValueRepository categoryValueRepository;

    public CategoryValueServiceImpl(CategoryValueRepository categoryValueRepository) {
        this.categoryValueRepository = categoryValueRepository;
    }

    @Override
    public List<CategoryValue> findAll() {
        return categoryValueRepository.findAll();
    }

    @Override
    public CategoryValue save(CategoryValue categoryValue) {
        return categoryValueRepository.save(categoryValue);
    }

    @Override
    public CategoryValue findById(Long id) {
        return categoryValueRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
    }
}
