package com.thedonershop.donershop.repository;

import com.thedonershop.donershop.model.entity.product.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
