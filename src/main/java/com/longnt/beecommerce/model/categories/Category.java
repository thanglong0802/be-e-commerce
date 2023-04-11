package com.longnt.beecommerce.model.categories;

import com.longnt.beecommerce.common.Common;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tbl_category")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Category extends Common {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String nameCategory;
}
