import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

interface Food {
    int getPrice();
}

class Burger implements Food {
    private int price = 15000;

    @Override
    public int getPrice() {
        return price;
    }
    
}

class Pizza implements Food {
    private int price = 50000;

    @Override
    public int getPrice() {
        return price;
    }
}

class Steak implements Food {
    private int price = 230000;

    @Override
    public int getPrice() {
        return price;
    }
}

class FoodFactory {
    public static Food getFood(String type) { 
        if (type.equalsIgnoreCase("burger") ) {
            return new Burger(); 
        } else if (type.equalsIgnoreCase("pizza")) {
            return new Pizza(); 
        } else if (type.equalsIgnoreCase("steak")) {
            return new Steak(); 
        } else {
            return null;
        }
    }
}

class Restaurant {
    public static int calculateTotal(List<Food> foods) { 
        int total = 0;
        for (int index = 0; index < foods.size(); index++) {
            Food food = foods.get(index);
            total += food.getPrice();
        }
        return total;
    }
}

public class P7Main {
    public static void main(String[] args) {       
        Food burger = FoodFactory.getFood("burger");
        Food pizza = FoodFactory.getFood("pizza");
        Food steak = FoodFactory.getFood("steak");

        List<Food> foods = new ArrayList<>();
        foods.add(burger);
        foods.add(pizza);
        foods.add(steak);
        foods.add(steak);
        
        int jumlahBurger = Collections.frequency(foods, burger);        
        int jumlahPizza = Collections.frequency(foods, pizza);
        int jumlahSteak = Collections.frequency(foods, steak);
        int total = Restaurant.calculateTotal(foods);

        System.out.println("==== Detail Pembayaran ====");
        System.out.println("===========================");
        System.out.println("Harga " + jumlahBurger + " Burger : Rp " + burger.getPrice() * jumlahBurger);
        System.out.println("Harga " + jumlahPizza + " Pizza  : Rp " + pizza.getPrice() * jumlahPizza);
        System.out.println("Harga " + jumlahSteak + " Steak  : Rp " + steak.getPrice() * jumlahSteak);
        System.out.println("___________________________+");

        System.out.println("Total Price    : Rp " + total);
    }
}