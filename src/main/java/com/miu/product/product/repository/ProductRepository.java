package com.miu.product.product.repository;

import com.miu.product.product.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Product, Long> {
    Product findByName(String name);
    List<Product> findByReviewsReviewer(String reviewerName);

}
