package com.example.redis.Repository;

import java.util.List;

import com.example.redis.Entity.Product;

public interface IProductRepo {

    Product save(Product product);

    List<Product> findAll();

    Product findProductById(int id);

    String deleteProduct(int id);

}