package com.longnt.beecommerce.model.categories;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.longnt.beecommerce.common.Common;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_category_value")
@Getter
@Setter
@ToString
public class CategoryValue extends Common {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "value")
    private String nameCategoryValue;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tbl_category_attribute_id", nullable = false)
    private CategoryAttribute categoryAttribute;

    public CategoryValue(Long isDelete, LocalDateTime createdAt, String createdBy, LocalDateTime updateAt, String updateBy, String nameCategoryValue, CategoryAttribute categoryAttribute) {
        super(isDelete, createdAt, createdBy, updateAt, updateBy);
        this.nameCategoryValue = nameCategoryValue;
        this.categoryAttribute = categoryAttribute;
    }

    public CategoryValue(String nameCategoryValue, CategoryAttribute categoryAttribute) {
        this.nameCategoryValue = nameCategoryValue;
        this.categoryAttribute = categoryAttribute;
    }

    public CategoryValue(){
    }
}
