package org.example;

import org.example.product.*;

public class Gift {
    public static void giveGift(Product product) {
        if (product instanceof ClothProduct || product instanceof FoodProduct) {
            System.out.println("Gift given with purchase of " + product.getName());
        }
    }
}
