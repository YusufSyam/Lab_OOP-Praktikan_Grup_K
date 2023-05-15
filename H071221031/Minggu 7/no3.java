import java.util.List;
import java.util.ArrayList;

class FoodFactory {
    public static Food getFood(String foodType) {
         switch (foodType.toLowerCase()) {
            case "burger":
                return new Burger(35000);
            case "pizza":
                return new Pizza(87000);
            case "steak":
                return new Steak(300000);
            default:
                throw new IllegalArgumentException("Invalid food type: " + foodType);
        }
    }
}


interface Food {
    int getPrice();
}

class Burger implements Food {

    private int price;

    public Burger(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

}

class Pizza implements Food {

    private int price;

    public Pizza(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

}

class Steak implements Food {

    private int price;

    public Steak(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

}

class Restaurant{

    public static int calculateTotal(List<Food> foods){
        int total = 0;

        for (Food foodList : foods){
            total += foodList.getPrice();
        }

        return total;
    }
}

class Main3{

    public static void main(String[] args){
        Food burger = FoodFactory.getFood("burger");
        Food pizza = FoodFactory.getFood("pizza");
        Food steak = FoodFactory.getFood("steak");

        List<Food> foods = new ArrayList<>();
        foods.add(burger);
        foods.add(pizza);
        foods.add(steak);
        foods.add(steak);

        int total = Restaurant.calculateTotal(foods);

        System.out.println("Total price: " + total);
    }
}
