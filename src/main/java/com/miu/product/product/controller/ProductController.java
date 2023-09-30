package com.miu.product.product.controller;

import com.miu.product.product.domain.Product;
import com.miu.product.product.domain.Review;
import com.miu.product.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("localost:4200")
public class ProductController {
    private final ProductService productService;
    @Autowired
    ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/hello") // /hello or value=/hello
    public String hello() {
        return "Hello world";
    }

    @RequestMapping(value = "/greeting/{name}")  // path variable
    public String greeting(@PathVariable String name) {
        return "Hello" + name;
    }

    @RequestMapping(value = "/greeting") // query param
    public String greetingQuery(@RequestParam String name) {
        return "Hello" + name;
    }


    // returning a class, a demo to return a product class that contains list of reviews
    @RequestMapping(value = "/getClass")
    public Product returnProduct() {
        Review review = new Review(23423L, "nigus", "good prioduct");
        Review review2 = new Review(23423L, "bazen", "good prioduct 2");
        List<Review> reviewList = new ArrayList<Review>();
        reviewList.add(review2);
        reviewList.add(review);
        return new Product(2342343L, "apple", 23, reviewList);
    }

// Reqeust mapping is a generic annotation
    @RequestMapping(value = "/product", method = RequestMethod.POST) // request mapping can be anything
    public String getString() {
        return "Some string";
    }

    // posting something
    @PostMapping("/product")
    public ResponseEntity<?> addProduct(@RequestBody Product product) {
        // call the product saving service interface here
        return null;
    }


    @DeleteMapping("/product/{productId}")
    public ResponseEntity<?> deleteProduct(@PathVariable String productId) { // the ? is generic type, we can return anything
        // call the service interface method here, to delete the method
        return null;
    }

    // updating a product
    public ResponseEntity<?> updateProduct(@PathVariable String productId, @RequestBody Product product) {
        // find the product
        // set the product values
        // thats it
        return new ResponseEntity<Product> (product,HttpStatus.OK);
    }


}
