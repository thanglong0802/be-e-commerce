package com.longnt.beecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryAttributeResponse {
    private String brandName;
    private List<String> valueName;
}
