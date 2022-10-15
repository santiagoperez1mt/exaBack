package com.example.demo.repository.interfaces;

import com.example.demo.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface IProductRepository extends MongoRepository<Product,Long> {
    public List<Product> findByPriceLessThanEqual(double price);
    @Query("{'category.id':?0}")
    public List<Product> findByCategory(Long id);
    public List<Product> findByNameLike(String name);
}
