package com.miu.product.product.service;

import com.miu.product.product.domain.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.objenesis.SpringObjenesis;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductServiceTest {
    private ProductServiceImpl productService;

    @BeforeEach
    public void setUp() throws Exception {
        productService = new ProductServiceImpl();
    }

    @Test
    public void addProductTest() {

        Product product = new Product(123L,"Nigus",2342,null);
        ArrayList<Product> products = new ArrayList<>();
        products.add(product);

        assertEquals(1, products.size());
    }

}
