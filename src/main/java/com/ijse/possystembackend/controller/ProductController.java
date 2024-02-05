package com.ijse.possystembackend.controller;

import com.ijse.possystembackend.dto.ProductDTO;
import com.ijse.possystembackend.entity.Product;
import com.ijse.possystembackend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<?> getAllProducts() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(productService.getAllProducts());
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed To Load the products");
        }
    }

    @PostMapping("/products")
    public ResponseEntity<?> createProduct(@RequestBody ProductDTO productDTO){
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(productService.createProduct(productDTO));
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("failed to create the product");
        }
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<?> getProductsById(@PathVariable Long id){
        Product product = productService.getProductById(id);
        if(product != null) {
            return ResponseEntity.status(HttpStatus.OK).body(product);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product Not Found");
        }
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<?> updateProduct(@PathVariable Long id, @RequestBody Product product){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(productService.updateProduct(id, product));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to update the product");
        }
    }

    @GetMapping("/categories/{id}/products")
    public ResponseEntity<?> getProductsByCategory(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(productService.getProductsByCategory(id));
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to get the products");
        }
    }

}
