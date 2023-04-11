package com.longnt.beecommerce.model.categories;

import com.longnt.beecommerce.common.Common;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_category")
@Getter
@Setter
@ToString
public class Category extends Common {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String nameCategory;

    public Category(Long isDelete, LocalDateTime createdAt, String createdBy, LocalDateTime updateAt, String updateBy, String nameCategory) {
        super(isDelete, createdAt, createdBy, updateAt, updateBy);
        this.nameCategory = nameCategory;
    }

    public Category(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public Category() {
    }
}
