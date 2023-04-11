package com.longnt.beecommerce.controller;

import com.longnt.beecommerce.model.categories.CategoryAttribute;
import com.longnt.beecommerce.model.categories.CategoryValue;
import com.longnt.beecommerce.service.impl.CategoryAttributeServiceImpl;
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
    private final CategoryAttributeServiceImpl categoryAttributeService;

    public CategoryValueController(CategoryValueServiceImpl categoryValueService, CategoryAttributeServiceImpl categoryAttributeService) {
        this.categoryValueService = categoryValueService;
        this.categoryAttributeService = categoryAttributeService;
    }

    @GetMapping("/getAll")
    public List<CategoryValue> getAllCategoryValue() {
        return categoryValueService.findAll();
    }

    @GetMapping("/")
    public void createCategoryValue() {
        CategoryAttribute attribute = categoryAttributeService.findByNameCategoryAttribute("brand");
        System.out.println("Dòng 27: " + attribute);
        if (attribute == null) {
            attribute = new CategoryAttribute("brand");
            System.out.println("Dòng 30: " + attribute);
            categoryAttributeService.save(attribute);
            CategoryValue value = new CategoryValue("test debug", attribute);
            categoryValueService.save(value);
        } else {
            CategoryValue value = new CategoryValue("test debug", attribute);
            categoryValueService.save(value);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryValue> getCategoryValueById(@PathVariable(value = "id") Long id) {
        CategoryValue categoryValue = categoryValueService.findById(id);
        return ResponseEntity.ok().body(categoryValue);
    }

}
