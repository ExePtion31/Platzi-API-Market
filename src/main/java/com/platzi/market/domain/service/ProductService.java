package com.platzi.market.domain.service;

import com.platzi.market.domain.Product;
import com.platzi.market.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.getAll();
    }

    public Optional<List<Product>> getByCategory(int category) {
        return productRepository.getByCategory(category);
    }

    public Optional<List<Product>> getScarseProducts(int quantity) {
        return productRepository.getScarseProducts(quantity);
    }

    public Optional<Product> getProduct(int id) {
        return productRepository.getProduct(id);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public boolean delete(int id) {
        return getProduct(id).map(product -> {
            productRepository.delete(id);
            return true;
        }).orElse(false);
    }
}
