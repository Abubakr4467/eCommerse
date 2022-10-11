package com.product.dto.request;

import lombok.Data;

@Data
public class CreateProductRequestDTO {
    private String name;
    private Double price;
    private String vendor;
    private String category;

}
