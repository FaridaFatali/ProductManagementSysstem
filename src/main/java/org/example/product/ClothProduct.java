package org.example.product;

import org.example.Locatable;

public class ClothProduct extends Product implements Locatable {
    private String sex;
    private String size;
    private String location;
    private String sku; // stock keeping unit
    private double tax;

    public ClothProduct(String name, double price, String sex, String size, String location, String sku, double tax) {
        super(name, price);
        this.sex = sex;
        this.size = size;
        this.location = location;
        this.sku = sku;
        this.tax = tax;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void purchase() {
        System.out.println("Cloth Product: " + getName() + " for " + sex + " and size " + size + " is purchased at the price of " + getPrice() + "$" + " with the tax of " + tax
                + "\nThe stock keeping unit: " + sku + ". Location: " + getLocation());

    }
}
