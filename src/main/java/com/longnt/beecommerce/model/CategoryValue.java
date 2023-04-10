//package com.longnt.beecommerce.model;
//
//import com.longnt.beecommerce.common.Common;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//
//import javax.persistence.*;
//import java.sql.Timestamp;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "tbl_category_value")
//@Getter
//@Setter
//@ToString
//public class CategoryValue extends Common {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "name_category_value")
//    private String nameCategoryValue;
//
//    // Cần Anotation để khóa ngoại với class CategoryAttribute
//    @Column(name = "id_category_attribute")
//    private Long idCategoryAttribute;
//
//    public CategoryValue(Boolean isDelete, LocalDateTime createdAt, String createdBy, LocalDateTime updateAt, String updateBy, String nameCategoryValue, Long idCategoryAttribute) {
//        super(isDelete, createdAt, createdBy, updateAt, updateBy);
//        this.nameCategoryValue = nameCategoryValue;
//        this.idCategoryAttribute = idCategoryAttribute;
//    }
//
//    public CategoryValue() {
//    }
//}
