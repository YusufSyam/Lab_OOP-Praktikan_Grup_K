import java.util.List;
import java.util.ArrayList;

interface Food {
    int getPrice();
}

class Burger implements Food {
    private int price = 17000;

    @Override
    public int getPrice() {
        return price;
    }
}

class Pizza implements Food {
    private int price = 75000;

    @Override
    public int getPrice() {
        return price;
    }
}

class Steak implements Food {
    private int price = 45000;

    @Override
    public int getPrice() {
        return price;
    }
}

class FoodFactory {
    public static Food getFood(String type) {
        if (type.equalsIgnoreCase("Burger")) {
            return new Burger();
        } else if (type.equalsIgnoreCase("Pizza")) {
            return new Pizza();
        } else if (type.equalsIgnoreCase("Steak")) {
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

public class No3 {
    public static void main(String[] args) {
        Food burger = FoodFactory.getFood("Burger");
        Food pizza = FoodFactory.getFood("Pizza");
        Food steak = FoodFactory.getFood("Steak");

        List<Food> foods = new ArrayList<>();
        foods.add(burger);
        foods.add(pizza);
        foods.add(steak);
        foods.add(steak);
        
        int total = Restaurant.calculateTotal(foods);

        System.out.println("Total Price    : Rp " + total);
    }
}
