import java.util.List;
import java.util.ArrayList;

interface Food {
    int getPrice();
}

class Burger implements Food {
    private int price = 100000;

    @Override
    public int getPrice() {
        return price;
    }
}

class Pizza implements Food {
    private int price = 85000;

    @Override
    public int getPrice() {
        return price;
    }
}

class Steak implements Food {
    private int price = 118000;

    @Override
    public int getPrice() {
        return price;
    }
}

class FoodFactory {
    public static Food getFood(String type) {   
        if (type.equalsIgnoreCase("Burger")) {
            return new Burger(); //objek baru
        } else if (type.equalsIgnoreCase("Pizza")) {
            return new Pizza();
        } else if (type.equalsIgnoreCase("Steak")) {
            return new Steak();
        } else {
            throw new IllegalArgumentException("Invalid food type");
        }
    }
}

class Restaurant {
    public static int calculateTotal(List<Food>foods) {
        int total = 0;
    
        for (Food food : foods) {
            total += food.getPrice();
        } return total;
    }
}

class Main {
    public static void main(String[] args) {
        Food burger = FoodFactory.getFood("burger");
        Food pizza = FoodFactory.getFood("burger");
        Food steak = FoodFactory.getFood("steak");

        System.out.println();
        System.out.println("=".repeat(42));
        System.out.println(" ".repeat(20) + "NOTA");
        System.out.println(" ".repeat(16) + "-".repeat(12));
        System.out.println("\n\t Burger Prices : Rp." + burger.getPrice() );
        System.out.println("\t Pizza Prices  : Rp." + pizza.getPrice() );
        System.out.println("\t Steak Prices  : Rp." + steak.getPrice() + "\n");

        List<Food> foods = new ArrayList<>();
        foods.add(burger);
        foods.add(pizza);
        foods.add(steak);

        int total = Restaurant.calculateTotal(foods);

        System.out.println(" ".repeat(8) + " " + "+".repeat(25));
        System.out.println("\t" + " " + "|"+ "Total Price : Rp." + total + "|");
        System.out.println(" ".repeat(8) + " " + "+".repeat(25));
        System.out.println();
        System.out.println("=".repeat(42));
    }
}