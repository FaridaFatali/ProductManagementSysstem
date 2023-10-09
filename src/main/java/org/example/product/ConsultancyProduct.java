package org.example.product;

public class ConsultancyProduct extends Product {
    private int hour;

    public ConsultancyProduct(String name, double price, int hour) {
        super(name, price);
        this.hour = hour;
    }

    @Override
    public void purchase() {
        System.out.println("Consulting Product: " + getName() + " in price of " + getPrice() + "$" + " per hour, during " + hour + " hour" +
                "\nTotal price: " + calculatePrice());

    }

    public double calculatePrice() {
        return getPrice() * hour;
    }
}
