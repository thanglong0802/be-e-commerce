package com.longnt.beecommerce.model.products;

import com.longnt.beecommerce.common.Common;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tbl_product_detail_img")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDetailImg extends Common {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "image")
    private String url;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tbl_prodcut_thumb_img")
    private Product product;
}
