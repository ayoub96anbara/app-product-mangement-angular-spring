package com.anbara.catalogservice.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Data @NoArgsConstructor
public class Product implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private int quantity;

    public Product(String name, String description, BigDecimal price,int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity=quantity;
    }
}
