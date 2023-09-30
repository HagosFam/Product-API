package com.miu.product.product.domain;

import lombok.Data;

@Data
public class Review {
    private Long reviewId;
    private String reviewer;
    private String review;

    public Review(Long reviewId, String reviewer, String review) {
        this.reviewId = reviewId;
        this.reviewer = reviewer;
        this.review = review;
    }
}
