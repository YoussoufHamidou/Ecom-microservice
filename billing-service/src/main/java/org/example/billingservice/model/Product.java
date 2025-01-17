package org.example.billingservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Product {
    @Id
    private String id;
    private String name;
    private double price;
    private int quantity;
}
