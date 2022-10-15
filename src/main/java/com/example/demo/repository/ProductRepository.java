package com.example.demo.repository;

import com.example.demo.model.Product;
import com.example.demo.repository.interfaces.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {
    @Autowired
    private IProductRepository crud;
    public List<Product> getAll(){
        return crud.findAll();
    }
    public Optional<Product> findById(Long id){
        return crud.findById(id);
    }
    public Product create(Product product){
        return crud.save(product);
    }
    public Product update(Product product){
        return crud.save(product);
    }
    public void delete(Product product){
        crud.delete(product);
    }
    public List<Product> productByLessOrEqualPrice(Double price){
        return crud.findByPriceLessThanEqual(price);
    }
    public List<Product> productByCategory(Long id){
        return crud.findByCategory(id);
    }
    public List<Product> productByName(String name){
        return crud.findByNameLike(name);
    }
}
