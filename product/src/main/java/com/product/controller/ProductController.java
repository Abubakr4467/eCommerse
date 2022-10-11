package com.product.controller;

import com.product.dto.request.CreateProductRequestDTO;
import com.product.model.ProductResponse;
import com.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/products")
@RequiredArgsConstructor
public class ProductController {


    private final ProductService productService;

    @GetMapping
    public ProductResponse getAllProducts(){
        return productService.getAllCategories();
    }

    @GetMapping("/{id}")
    public ProductResponse getProduct(@PathVariable Integer id ){
        return productService.getProduct(id);
    }


    @PostMapping
    public ProductResponse saveProduct(@RequestBody CreateProductRequestDTO createProductRequestDTO){
        return productService.saveProduct(createProductRequestDTO);
    }

}
