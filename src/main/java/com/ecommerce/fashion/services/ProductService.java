package com.ecommerce.fashion.services;

import com.ecommerce.fashion.dto.ProductDto;
import com.ecommerce.fashion.entities.Product;

import java.util.List;
import java.util.UUID;


public interface ProductService {

    public Product addProduct(ProductDto product);
    public List<ProductDto> getAllProducts(UUID categoryId, UUID typeId);

    ProductDto getProductBySlug(String slug);

    ProductDto getProductById(UUID id);

    Product updateProduct(ProductDto productDto, UUID id);

    Product fetchProductById(UUID uuid) throws Exception;
}
