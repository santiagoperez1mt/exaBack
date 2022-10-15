package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="category")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    private Long id;
    private String name;
}
