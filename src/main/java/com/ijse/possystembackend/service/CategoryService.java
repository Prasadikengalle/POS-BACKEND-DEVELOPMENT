package com.ijse.possystembackend.service;

import com.ijse.possystembackend.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {

    List<Category> getAllCategories();

    Category findCategoryById(Long id);

    Category createCategory(Category category);

    Category updateCategory(Long id, Category category);
}
