package com.example.redis.Entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@RedisHash("Product")
public class Product implements Serializable{
    @Id
    private int id;
    private String name;
    private int qty;
    private long price;
    
}
