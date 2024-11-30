package com.thedonershop.donershop.service.contracts;

import com.thedonershop.donershop.model.entity.product.Category;

public interface CategoryService {

    void add(Category category);
    Category findById(String id) throws Exception;
}
