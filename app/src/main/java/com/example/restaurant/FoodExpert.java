package com.example.restaurant;

import java.util.ArrayList;
import java.util.List;

public class FoodExpert {
    List<String> getFoods(String menu) {
        List<String> meals = new ArrayList<>();
        if (menu.equals("Breakfast")) {
            meals.add("Donut");
            meals.add("Hash-browns");
            meals.add("Waffle and eggs");
        } else if (menu.equals("Lunch")) {
            meals.add("Fish and Chips");
            meals.add("Lobster Rolls");
            meals.add("Carne Asada Burrito");
        }
        else if (menu.equals("Dinner")) {
            meals.add("Poutine with egg aeoli");
            meals.add("Deep dish pizza");
            meals.add("Bento");
        }
        return meals;
    }
}
