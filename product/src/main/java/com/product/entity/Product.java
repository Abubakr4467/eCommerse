package com.product.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String vendor;
    private String  category;
    private Double price;

    public Product( String name, String vendor, String category, Double price){
        this.name= name;
        this.vendor = vendor;
        this.category = category;
        this.price = price;
    }



}
