package com.miu.product.product.controller;

import com.miu.product.product.domain.Product;
import com.miu.product.product.domain.ProductAdapter;
import com.miu.product.product.domain.ProductDTO;
import com.miu.product.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/product")
public class ProductController {
    private final ProductService productService;

    @Autowired
    ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> listProducts() {
        List<Product> products = productService.fetchProducts();
        return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ProductDTO> createProduct(@RequestBody Product product) {
        ProductDTO product1 = productService.createProduct(product);
        return new ResponseEntity<ProductDTO>(product1, HttpStatus.OK);
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable String productId) { // the ? is generic type, we can return anything
      productService.deleteProduct(productId);
        return new ResponseEntity<>( HttpStatus.NO_CONTENT);
    }

    // updating a product

    @PutMapping("/{productId}")
    public ResponseEntity<ProductDTO> updateProduct(@PathVariable String productId, @RequestBody Product product) {
        ProductDTO product1 = productService.updateProduct(product, productId);
        return new ResponseEntity<ProductDTO>(product1, HttpStatus.OK);
    }


}
