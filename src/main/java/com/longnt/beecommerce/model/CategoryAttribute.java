package com.longnt.beecommerce.model;

import com.longnt.beecommerce.common.Common;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_category_attribute")
@Getter
@Setter
@ToString
public class CategoryAttribute extends Common {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_category_attribute")
    private String nameCategoryAttribute;

    public CategoryAttribute(Boolean isDelete, Date createdAt, String createdBy, Date updateAt, String updateBy, String nameCategoryAttribute) {
        super(isDelete, createdAt, createdBy, updateAt, updateBy);
        this.nameCategoryAttribute = nameCategoryAttribute;
    }

    public CategoryAttribute() {
    }
}
