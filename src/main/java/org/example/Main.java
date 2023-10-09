package org.example;

import org.example.product.*;
import java.time.*;

/**
 * @author Farida Fatali
 * We have 3 kinds of products: Food, Cloth and Consultancy. For Food and Clothes we have location and price,
 * but for Consultancy we have only price, not location. We also have gifts for Food and Cloth products.
 * We also sell our old items that they are not products, we sell them from our depot, they have location and price.
 */

public class Main {
    public static void main(String[] args) {
        FoodProduct foodProduct = new FoodProduct("Milk", 3.5, LocalDate.of(2023, Month.APRIL, 23), 120, "X SuperMarket", "55", 1.5);
        ClothProduct clothProduct = new ClothProduct("T-shirt", 460, "Female", "S", "Chanel", "12", 15);
        ConsultancyProduct consultancyProduct = new ConsultancyProduct("Consulting Service", 200, 2);
        SecondHand secondHand = new SecondHand("Computer", 300, 6, "Depot");

        foodProduct.purchase();
        Gift.giveGift(foodProduct);
        System.out.println();

        clothProduct.purchase();
        Gift.giveGift(clothProduct);
        System.out.println();

        consultancyProduct.purchase();
        System.out.println();

        secondHand.sell();
    }
}