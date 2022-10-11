package com.product.service.imp;

import com.product.dto.request.CreateProductRequestDTO;
import com.product.entity.Product;
import com.product.model.ProductResponse;
import com.product.repo.ProductRepo;
import com.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImp implements ProductService {

    private final ProductRepo productRepo;

    @Override
    public ProductResponse getAllCategories(){
        List<Product> products = productRepo.findAll();
        return new ProductResponse(products, true);
    }


    @Override
    public ProductResponse getProduct(int id){
        Product product = productRepo.findById(id).orElse(null);
        return new ProductResponse(product, true);

    }

    @Override
    public ProductResponse saveProduct(CreateProductRequestDTO createProductRequestDTO){
        Product product = new Product(
                createProductRequestDTO.getName(),
                createProductRequestDTO.getVendor(),
                createProductRequestDTO.getCategory(),
                createProductRequestDTO.getPrice()
                );

        productRepo.save(product);
        return new ProductResponse(product, true);
    }
}
