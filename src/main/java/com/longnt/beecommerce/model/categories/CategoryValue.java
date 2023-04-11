package com.longnt.beecommerce.model.categories;

import com.longnt.beecommerce.common.Common;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tbl_category_value")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CategoryValue extends Common {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "value")
    private String nameCategoryValue;

    @ManyToOne
    @JoinColumn(name = "tbl_category_attribute_id", nullable = false)
    private CategoryAttribute categoryAttribute;
}
