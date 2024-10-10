package com.thedonershop.donershop.service.implementation;

import com.thedonershop.donershop.model.entity.product.Product;
import com.thedonershop.donershop.repository.ProductRepository;
import com.thedonershop.donershop.service.contracts.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.repository = productRepository;
    }

    @Override
    public void add(Product product) {
        repository.insert(product);
    }
}
