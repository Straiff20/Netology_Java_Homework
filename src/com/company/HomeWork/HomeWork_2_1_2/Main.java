package com.company.HomeWork.HomeWork_2_1_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[]{
                new Product("Milk", 5, 120, "Drink"),
                new Product("Whisky", 4, 1020, "Alcohol"),
                new Product("Meat", 1, 400, "Food"),
                new Product("Meat2", 1, 400, "Food"),
                new Product("Meat3", 1, 0, "Food"),
        };

        Arrays.sort(products);
        System.out.println(Arrays.toString(products));
    }
}
