package com.longnt.beecommerce.model;

import com.longnt.beecommerce.common.Common;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;
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

    @Column(name = "name_category")
    private String nameCategory;

    public Category(String nameCategory, Boolean isDelete, LocalDateTime createdAt, String createdBy, LocalDateTime updateAt, String updateBy) {
        super(isDelete, createdAt, createdBy, updateAt, updateBy);
        this.nameCategory = nameCategory;
    }

    public Category() {
    }
}
