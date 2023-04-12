package com.longnt.beecommerce.repository;

import com.longnt.beecommerce.model.products.ProductsAttribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsAttributeRepository extends JpaRepository<ProductsAttribute, Long> {
}
