package com.thedonershop.donershop.service.implementation;

import com.thedonershop.donershop.model.entity.product.Category;
import com.thedonershop.donershop.repository.CategoryRepository;
import com.thedonershop.donershop.service.contracts.CategoryService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository repository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.repository = categoryRepository;
    }

    @Override
    public void add(Category category) {
        repository.save(category);
    }

    @Override
    public Category findById(String id) throws Exception {
        Optional<Category> category = repository.findById(id);
        if (category.isPresent()) {
            return category.get();
        }
        throw new Exception("No such category");
    }
}
