package org.example.product;

import org.example.Priceable;

public abstract class Product implements Priceable {
    private String name;
    private double price;


    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract void purchase();
}
