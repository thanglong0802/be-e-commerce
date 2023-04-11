package com.longnt.beecommerce.repository;

import com.longnt.beecommerce.model.categories.CategoryAttribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryAttributeRepository extends JpaRepository<CategoryAttribute, Long> {
    CategoryAttribute findByNameCategoryAttribute(String name);
}
