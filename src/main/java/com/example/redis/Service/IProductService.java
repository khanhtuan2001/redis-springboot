package com.example.redis.Service;

import java.util.List;

import com.example.redis.Entity.Product;

public interface IProductService {

    Product saveProduct(Product product);

    List<Product> geList();

    Product findById(int id);

    String delete(int id);

}