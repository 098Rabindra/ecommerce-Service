package com.example.ecommerce_Service.controller;

import com.example.ecommerce_Service.entity.Product;
import com.example.ecommerce_Service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    // Add Product
    @PostMapping("/addProducts")
    public Product addProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    // Get All Products
    @GetMapping("/getAllProducts")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}