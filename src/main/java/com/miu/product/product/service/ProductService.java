package com.miu.product.product.service;

import com.miu.product.product.domain.Product;
import com.miu.product.product.domain.ProductDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {

    ProductDTO createProduct(Product product);
    ProductDTO editProduct(Product product, Long productId);
    ProductDTO deleteProduct(Long productId);
    ProductDTO searchProduct(Long productId);
     ProductDTO findByName(String productId);
     List<ProductDTO> findByReviewReviewer(String reviewerName);
     List<ProductDTO> fetchProduct();
}
