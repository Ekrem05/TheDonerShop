package com.thedonershop.donershop.repository;

import com.thedonershop.donershop.model.entity.product.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Category, String> {
}
