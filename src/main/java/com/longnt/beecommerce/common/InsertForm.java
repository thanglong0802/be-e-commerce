package com.longnt.beecommerce.common;

import java.io.Serializable;

public class InsertForm implements Serializable {
    private String nameCategoryAttribute;
    private String nameCategoryValue;

    public String getNameCategoryAttribute() {
        return nameCategoryAttribute;
    }

    public void setNameCategoryAttribute(String nameCategoryAttribute) {
        this.nameCategoryAttribute = nameCategoryAttribute;
    }

    public String getNameCategoryValue() {
        return nameCategoryValue;
    }

    public void setNameCategoryValue(String nameCategoryValue) {
        this.nameCategoryValue = nameCategoryValue;
    }

    public InsertForm withNameCategoryAttribute(String nameCategoryAttribute) {
        this.nameCategoryAttribute = nameCategoryAttribute;
        return this;
    }

    public InsertForm withNameCategoryValue(String nameCategoryValue) {
        this.nameCategoryValue = nameCategoryValue;
        return this;
    }
}
