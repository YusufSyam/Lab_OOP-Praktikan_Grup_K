package Nomor3;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Food> foods = new ArrayList<>();
        int total = 0;

        foods.add(FoodFactory.getFood("Burger"));
        foods.add(FoodFactory.getFood("Pizza"));
        foods.add(FoodFactory.getFood("Pizza"));       
        foods.add(FoodFactory.getFood("Steak"));
        
        total = Restaurant.calculateTotal(foods);

        System.out.println("Total Harga Makanan " + total);
    }
}
