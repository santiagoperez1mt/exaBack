package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
@CrossOrigin("*")
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("/all")
    public List<Product> getAll(){
        return service.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Product> getProduct(@PathVariable("id") Long id){
        return service.getProduct(id);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Product create(@RequestBody Product product){
        return service.create(product);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Product update(@RequestBody Product product){
        return service.update(product);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Boolean delete(@PathVariable("id") Long id){
        return service.delete(id);
    }
    @GetMapping("/price/{price}")
    public List<Product> productsByPrice(@PathVariable("price") Double price ){
        return service.productByPriceLessOrEqual(price);
    }
    @GetMapping("/category/{category}")
    public List<Product> productsByCategory(@PathVariable("category") Long id){
        return service.productByCategory(id);
    }
    @GetMapping("/name/{name}")
    public List<Product> productsByName(@PathVariable("name") String name){
        return service.productByName(name);
    }
}
