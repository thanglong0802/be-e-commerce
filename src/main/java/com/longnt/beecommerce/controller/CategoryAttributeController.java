package com.longnt.beecommerce.controller;

import com.longnt.beecommerce.common.InsertForm;
import com.longnt.beecommerce.dto.CategoryAttributeResponse;
import com.longnt.beecommerce.model.categories.CategoryAttribute;
import com.longnt.beecommerce.service.impl.CategoryAttributeServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/category-attribute")
public class CategoryAttributeController {
    private final CategoryAttributeServiceImpl categoryAttributeService;

    public CategoryAttributeController(CategoryAttributeServiceImpl categoryAttributeService) {
        this.categoryAttributeService = categoryAttributeService;
    }

    @GetMapping("/")
    public List<CategoryAttribute> getAllCategoryAttributes() {
        return categoryAttributeService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryAttribute> getCategoryAttributeById(@PathVariable(value = "id") Long id) {
        CategoryAttribute categoryAttribute = categoryAttributeService.findById(id);
        return ResponseEntity.ok().body(categoryAttribute);
    }

    @PostMapping("/")
    public InsertForm createCategoryAttribute(@RequestBody InsertForm form) {
        return categoryAttributeService.createCategoryAttribute(form);
    }
    @GetMapping("/getAllValue/{id}")
    public CategoryAttributeResponse findByQuery(@PathVariable Long id){
        return categoryAttributeService.handler(id);
    }
}
