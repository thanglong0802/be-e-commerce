package com.longnt.beecommerce.service.impl;

import com.longnt.beecommerce.common.InsertForm;
import com.longnt.beecommerce.dto.CategoryAttributeResponse;
import com.longnt.beecommerce.model.categories.CategoryAttribute;
import com.longnt.beecommerce.model.categories.CategoryValue;
import com.longnt.beecommerce.repository.CategoryAttributeRepository;
import com.longnt.beecommerce.repository.CategoryValueRepository;
import com.longnt.beecommerce.service.CategoryAttributeService;
import com.longnt.beecommerce.service.CategoryValueService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryAttributeServiceImpl implements CategoryAttributeService {
    private final CategoryAttributeRepository categoryAttributeRepository;

    private final CategoryValueService categoryValueService;
    private final CategoryValueRepository categoryValueRepository;

    public CategoryAttributeServiceImpl(CategoryAttributeRepository categoryAttributeRepository, CategoryValueService categoryValueService, CategoryValueRepository categoryValueRepository) {
        this.categoryAttributeRepository = categoryAttributeRepository;
        this.categoryValueService = categoryValueService;
        this.categoryValueRepository = categoryValueRepository;
    }

    @Override
    public List<CategoryAttribute> findAll() {
        return categoryAttributeRepository.findAll();
    }

    @Override
    public CategoryAttribute findById(Long id) {
        return categoryAttributeRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
    }

    @Override
    public CategoryAttribute save(CategoryAttribute categoryAttribute) {
        return categoryAttributeRepository.save(categoryAttribute);
    }

    @Override
    public CategoryAttribute findByNameCategoryAttribute(String name) {
        CategoryAttribute attribute = categoryAttributeRepository.findByNameCategoryAttribute(name);
        return attribute;
    }

    @Override
    public InsertForm createCategoryAttribute(InsertForm form) {
        CategoryAttribute categoryAttribute = categoryAttributeRepository.findByNameCategoryAttribute(form.getNameCategoryAttribute().toLowerCase());
        if (categoryAttribute == null) {
            categoryAttribute = new CategoryAttribute(form.getNameCategoryAttribute().toLowerCase());
            categoryAttributeRepository.save(categoryAttribute);
            CategoryValue categoryValue = new CategoryValue(form.getNameCategoryValue().toLowerCase(), categoryAttribute);
            categoryValueService.save(categoryValue);
            return form;
        } else {
            CategoryValue categoryValue = new CategoryValue(form.getNameCategoryValue().toLowerCase(), categoryAttribute);
            categoryValueService.save(categoryValue);
            return form;
        }
    }
    public CategoryAttributeResponse handler(Long id) {
        CategoryAttributeResponse result = new CategoryAttributeResponse();
        List<String> valueName = new ArrayList<>();
        CategoryAttribute categoryAttribute = categoryAttributeRepository.findById(id).orElseThrow(() -> new RuntimeException("Khong tim thay"));
        List<CategoryValue> categoryValues = categoryValueRepository.findAll();
        categoryValues.stream().filter(p -> p.getCategoryAttribute().getId() == id).collect(Collectors.toList());
        for (CategoryValue item: categoryValues) {
            valueName.add(item.getNameCategoryValue());
        }
        result.setBrandName(categoryAttribute.getNameCategoryAttribute());
        result.setValueName(valueName);
        return result;
    }
}
