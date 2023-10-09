package org.example;

public class SecondHand implements Locatable, Priceable {
    private String name;
    private double price;
    private double year; // How many years we used it
    private String location;

    public SecondHand(String name, double price, double year, String location) {
        this.name = name;
        this.price = price;
        this.year = year;
        this.location = location;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void sell() {
        System.out.println("The Second-Hand item " + name + " is selling for " + price + "$ " +
                "\nWere used for " + year + " years. And the location is " + getLocation());
    }
}
