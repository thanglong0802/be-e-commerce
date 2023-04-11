package com.longnt.beecommerce.model.categories;

import com.longnt.beecommerce.common.Common;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_category_attribute")
@Getter
@Setter
@ToString
public class CategoryAttribute extends Common {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String nameCategoryAttribute;

    public CategoryAttribute(String nameCategoryAttribute) {
        this.nameCategoryAttribute = nameCategoryAttribute;
    }

    public CategoryAttribute(Long isDelete, LocalDateTime createdAt, String createdBy, LocalDateTime updateAt, String updateBy, String nameCategoryAttribute) {
        super(isDelete, createdAt, createdBy, updateAt, updateBy);
        this.nameCategoryAttribute = nameCategoryAttribute;
    }

    public CategoryAttribute(){
    }
}
