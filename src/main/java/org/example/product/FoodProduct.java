package org.example.product;

import org.example.Locatable;
import java.time.LocalDate;

public class FoodProduct extends Product implements Locatable {
    private LocalDate productionDate;
    private double shelfLifeInDays;
    private String location;
    private String sku; // stock keeping unit
    private double tax;

    public FoodProduct(String name, double price, LocalDate productionDate, double shelfLifeInDays, String location, String sku, double tax) {
        super(name, price);
        this.productionDate = productionDate;
        this.shelfLifeInDays = shelfLifeInDays;
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
        System.out.println("Food Product: " + getName() + " is purchased at the price of " + getPrice() + "$" + " with the tax of " + tax
                + "\nProduction Date of " + getName() + ": " + productionDate + ". Life as month: " + shelfLifeInDays
                + "\nThe stock keeping unit: " + sku + ". Location: " + getLocation());

    }
}
