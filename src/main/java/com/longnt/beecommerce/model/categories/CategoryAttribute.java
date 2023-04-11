package com.longnt.beecommerce.model.categories;

import com.longnt.beecommerce.common.Common;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tbl_category_attribute")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CategoryAttribute extends Common {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String nameCategoryAttribute;
}
