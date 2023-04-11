package com.longnt.beecommerce.repository;

import com.longnt.beecommerce.model.categories.CategoryValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryValueRepository extends JpaRepository<CategoryValue, Long> {
}
