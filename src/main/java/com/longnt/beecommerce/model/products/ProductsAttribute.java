package com.longnt.beecommerce.model.products;

import com.longnt.beecommerce.common.Common;
import com.longnt.beecommerce.model.categories.Category;
import com.longnt.beecommerce.model.categories.CategoryAttribute;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tbl_products_attribute")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductsAttribute extends Common {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tbl_category_id")
    private Category category;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tbl_category_attribute_id")
    private CategoryAttribute categoryAttribute;
}
