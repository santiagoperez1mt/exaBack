package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id;


@Document(collection="product")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Transient
    public static final String SEQUENCE_NAME = "product_sequence";
    @Id
    private Long id;
    private Category category;
    private String name;
    private String description;
    private Double price;
    private Boolean availability=true;
    private Integer quantity;
    private String imageUrl;

}
