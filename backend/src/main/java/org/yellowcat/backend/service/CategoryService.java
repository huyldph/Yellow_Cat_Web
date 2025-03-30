package org.yellowcat.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yellowcat.backend.dto.request.CategoryRequest;
import org.yellowcat.backend.dto.response.CategoryResponse;
import org.yellowcat.backend.entity.Category;
import org.yellowcat.backend.mapper.CategoryMapper;
import org.yellowcat.backend.repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryMapper categoryMapper;

    public Category createCategory(CategoryRequest request) {
        return categoryRepository.save(categoryMapper.categoryRequestToCategory(request));
    }

    public List<CategoryResponse> getAllCategories() {
        return categoryRepository.findAll().stream().map(categoryMapper::categoryToCategoryResponse).toList();
    }

    public Category updateCategory(CategoryRequest request) {
        return categoryRepository.save(categoryMapper.categoryRequestToCategory(request));
    }

    public void deleteCategory(Integer id) {
        categoryRepository.deleteById(id);
    }
}
