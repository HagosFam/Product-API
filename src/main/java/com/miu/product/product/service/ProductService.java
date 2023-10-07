package com.miu.product.product.service;

import com.miu.product.product.domain.Product;
import com.miu.product.product.domain.ProductDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {

    ProductDTO createProduct(Product product);
    ProductDTO updateProduct(Product product, String productId);
    void deleteProduct(String Id);
    ProductDTO searchProduct(String productId);
     ProductDTO findByName(String productId);
     List<ProductDTO> findByReviewReviewer(String reviewerName);
     List<Product> fetchProducts();
}
