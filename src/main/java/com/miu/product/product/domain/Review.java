package com.miu.product.product.domain;

import lombok.Data;

@Data
public class Review {
    private String reviewId;
    private String reviewer;
    private String review;

    public Review(String reviewId, String reviewer, String review) {
        this.reviewId = reviewId;
        this.reviewer = reviewer;
        this.review = review;
    }
}
