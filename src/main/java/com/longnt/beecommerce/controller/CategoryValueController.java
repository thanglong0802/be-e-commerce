package com.longnt.beecommerce.controller;

import com.longnt.beecommerce.model.categories.CategoryValue;
import com.longnt.beecommerce.service.impl.CategoryValueServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/category-value")
public class CategoryValueController {
    private final CategoryValueServiceImpl categoryValueService;

    public CategoryValueController(CategoryValueServiceImpl categoryValueService) {
        this.categoryValueService = categoryValueService;
    }

    @GetMapping("/")
    public List<CategoryValue> getAllCategoryValue() {
        return categoryValueService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryValue> getCategoryValueById(@PathVariable(value = "id") Long id) {
        CategoryValue categoryValue = categoryValueService.findById(id);
        return ResponseEntity.ok().body(categoryValue);
    }
}
