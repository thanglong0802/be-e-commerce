package com.longnt.beecommerce.common;

import lombok.*;

import javax.persistence.Column;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Common {
    @Column(name = "is_delete", columnDefinition = "false")
    private Boolean isDelete;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_at")
    private Date updateAt;

    @Column(name = "updated_by")
    private String updateBy;
}
