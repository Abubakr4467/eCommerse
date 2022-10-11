package com.product.service;

import com.product.dto.request.CreateProductRequestDTO;
import com.product.model.ProductResponse;

public interface ProductService {
    ProductResponse getAllCategories();
    ProductResponse getProduct(int id);
    ProductResponse saveProduct(CreateProductRequestDTO product);

}
