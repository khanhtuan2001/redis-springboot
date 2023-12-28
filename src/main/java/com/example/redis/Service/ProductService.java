package com.example.redis.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.redis.Entity.Product;
import com.example.redis.Repository.IProductRepo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ProductService implements IProductService {

    @Autowired
    private IProductRepo productRepo;

    @Override
    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public List<Product> geList() {
        return productRepo.findAll();
    }

    @Override
    public Product findById(int id) {
        log.info("getfrom db");
        return productRepo.findProductById(id);
    }

    @Override
    public String delete(int id) {
        return productRepo.deleteProduct(id);
    }
}
