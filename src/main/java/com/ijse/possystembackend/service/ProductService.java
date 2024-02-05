package com.ijse.possystembackend.service;

import com.ijse.possystembackend.dto.ProductDTO;
import com.ijse.possystembackend.entity.Category;
import com.ijse.possystembackend.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List<Product> getAllProducts();

    Product createProduct(ProductDTO productDTO);

    Product getProductById(Long id);

    Product updateProduct(Long id, Product product);

    List<Product> getProductsByCategory(Long id);
}
