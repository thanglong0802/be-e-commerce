package com.longnt.beecommerce.model.products;

import com.longnt.beecommerce.common.Common;
import com.longnt.beecommerce.model.categories.Category;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tbl_product")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Product extends Common {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String nameProduct;
    private String status;

    @Column(name = "thumb_img")
    private String thumbImg;
    private Double price;
    private Integer quantity;
    private String description;

    @Column(name = "cong_dung")
    private String congDung;

    @Column(name = "nha_san_xuat")
    private String nhaSanXuat;

    @Column(name = "noi_san_xuat")
    private String noiSanXuat;

    @ManyToOne
    @JoinColumn(name = "tbl_category_id", nullable = false)
    private Category category;
}
