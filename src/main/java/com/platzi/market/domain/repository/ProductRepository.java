package com.platzi.market.domain.repository;

import com.platzi.market.domain.Product;

import java.util.*;

public interface ProductRepository {
    List<Product> getAll();

    Optional<List<Product>> getByCategory(int category);

    Optional<List<Product>> getScarseProducts(int quantity);

    Optional<Product> getProduct(int id);

    Product save(Product product);

    void delete(int id);
}
