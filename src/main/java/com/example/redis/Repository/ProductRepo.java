package com.example.redis.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.example.redis.Entity.Product;

@Repository
public class ProductRepo {
    public static final String HASH_KEY= "Product";
    @Autowired
    private RedisTemplate template;


    public Product save(Product product) {
        template.opsForHash().put(HASH_KEY, product.getId(), product);
        return product;

    }
    public List<Product> findAll(){
        return template.opsForHash().values(HASH_KEY);
    }

    public Product findProductById(int id){
        return (Product) template.opsForHash().get(HASH_KEY, id);
    }

    public String deleteProduct(int id){
         template.opsForHash().delete(HASH_KEY, id);
         return "removed";
    }
}
