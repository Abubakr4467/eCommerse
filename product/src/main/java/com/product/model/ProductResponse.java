package com.product.model;

import com.product.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {

    private Boolean success;
    private String message;
    private Object data;

    public ProductResponse(Object data, Boolean success) {
        this.success = success;
        this.data = data;
        this.message = "Request successfully completed";
    }


}
