package com.miu.product.product.service;

import com.miu.product.product.domain.Product;
import com.miu.product.product.domain.ProductAdapter;
import com.miu.product.product.domain.ProductDTO;
import com.miu.product.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Override
    public ProductDTO createProduct(Product product) {
       // create a product
       Product product1 =  productRepository.save(product);
       return ProductAdapter.toProductDTO(product1);
    }

    @Override
    public ProductDTO editProduct(Product product, Long productId) {
        Optional<Product> product1 = productRepository.findById(productId);
         if(!product1.isEmpty()) {
         }
         return null;
    }

    @Override
    public ProductDTO deleteProduct(Long productId) {
          // delete a product
            Optional<Product> product1 = productRepository.findById(productId);
            if(!product1.isEmpty()) {
                productRepository.deleteById(productId);
            }
            return null;
    }

    @Override
    public ProductDTO searchProduct(Long productId) {
        Product product = productRepository.findById(productId).get();
        return ProductAdapter.toProductDTO(product);
    }

    @Override
    public ProductDTO findByName(String name) {
       Product products = productRepository.findByName(name);
       return ProductAdapter.toProductDTO(products);
    }

    @Override
    public List<ProductDTO> findByReviewReviewer(String reviewerName) {
        List<Product> products = productRepository.findByReviewsReviewer(reviewerName);
        return ProductAdapter.toProductDTOs(products);
    }
    @Override
    public List<ProductDTO> fetchProduct() {
       List<Product> products = productRepository.findAll();
         return ProductAdapter.toProductDTOs(products);
    }

}
