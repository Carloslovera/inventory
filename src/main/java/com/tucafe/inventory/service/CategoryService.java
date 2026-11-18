package com.tucafe.inventory.service;

import com.tucafe.inventory.model.Category;
import com.tucafe.inventory.repository.CategoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories(){return categoryRepository.finAll(); }

    public Optional<Category> getCategoryById(Long id) {return categoryRepository.findById(id);}

    public Category createCategory(Category category){return categoryRepository.save(category);}

    public Category updateCategory(Long id, Category categoryDetails) {
        Category existingCategory = categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Categoría no encontrada"));

        existingCategory.setName(categoryDetails.getName());
        existingCategory.setDescription(categoryDetails.getDescription());
        return categoryRepository.save(existingCategory);
    }

    public Category deleteCategory(Long id){

        Category existingCategory = categoryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Categoría no encontrada"));

        categoryRepository.delete(existingCategory);
        return existingCategory;
    }


}
