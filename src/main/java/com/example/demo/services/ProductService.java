package com.example.demo.services;

import com.example.demo.model.DatabaseSequence;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;
    @Autowired
    private SequenceGeneratorService generator;
    public List<Product> getAll() {
        return repository.getAll();
    }
    public Optional<Product> getProduct(Long id){
        return repository.findById(id);
    }
    public Product create(Product product){
        product.setId(generator.generateSequence(Product.SEQUENCE_NAME));
        return repository.create(product);
    }
    public Product update(Product product){
        Optional<Product> storedProduct = repository.findById(product.getId());
        if(storedProduct.isPresent()){
            if(product.getCategory()!=null){
                storedProduct.get().setCategory(product.getCategory());
            }
            if(product.getName()!=null){
                storedProduct.get().setName(product.getName());
            }
            if(product.getDescription()!=null){
                storedProduct.get().setDescription(product.getDescription());
            }
            if(product.getPrice()!=null){
                storedProduct.get().setPrice(product.getPrice());
            }
            if(product.getQuantity()!=null){
                storedProduct.get().setQuantity(product.getQuantity());
            }
            if(product.getImageUrl()!=null){
                storedProduct.get().setImageUrl(product.getImageUrl());
            }
            storedProduct.get().setAvailability(product.getAvailability());
            repository.update(product);
            return storedProduct.get();
        }
        return null;
    }
    public boolean delete(Long id){
        return getProduct(id).map(product -> {
            repository.delete(product); return true;}
        ).orElse(false);
    }
    public List<Product> productByPriceLessOrEqual(Double price){
        return repository.productByLessOrEqualPrice(price);
    }
    public List<Product> productByCategory(Long id){
        return repository.productByCategory(id);
    }
    public List<Product> productByName(String name){
        return repository.productByName(name);
    }
}
