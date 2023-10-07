package com.miu.product.product.domain;

import java.util.List;
import java.util.stream.Collectors;

public class ProductAdapter {
    public static ProductDTO toProductDTO(Product product) {
        // extract reviewId from list of reviews
         List<String> reviewsId = product.getReviews().stream().map(Review::getReviewId).collect(Collectors.toList());
        return new ProductDTO(product.getId(),product.getProductId(), product.getName(), product.getPrice(), reviewsId);
    }

    public static List<ProductDTO> toProductDTOs(List<Product> products) {
        return products.stream()
                .map(ProductAdapter::toProductDTO)
                .collect(Collectors.toList());
    }
}
