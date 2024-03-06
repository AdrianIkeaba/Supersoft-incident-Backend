package com.supersoft.incident.service.category;

import com.supersoft.incident.model.category.Category;
import com.supersoft.incident.repository.category.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<String> getCategoryNames() {
        List<Category> categories = categoryRepository.findAll();
        return categories.stream()
                .map(Category::getCategoryName)
                .collect(Collectors.toList());
    }
}

