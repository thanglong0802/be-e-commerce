package com.longnt.beecommerce.model;

import com.longnt.beecommerce.common.Common;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

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

    public Category(Boolean isDelete, Date createdAt, String createdBy, Date updateAt, String updateBy, String nameCategory) {
        super(isDelete, createdAt, createdBy, updateAt, updateBy);
        this.nameCategory = nameCategory;
    }

    public Category() {
    }
}
