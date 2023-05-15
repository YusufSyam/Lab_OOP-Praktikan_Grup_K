import java.util.List;
import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        Food burger = FoodFactory.getFood("burger");
        Food pizza = FoodFactory.getFood("pizza");
        Food steak = FoodFactory.getFood("steak");

        System.out.println();
        System.out.println("=".repeat(40));
        System.out.println(" ".repeat(15) + "PEMBAYARAN");
        System.out.println(" ".repeat(14) + "-".repeat(12));
        System.out.println("\n\t  Harga Burger : " + burger.getPrice() );
        System.out.println("\t  Harga Pizza  : " + pizza.getPrice() );
        System.out.println("\t  Harga steak  : " + steak.getPrice() + "\n");

        List<Food> foods = new ArrayList<>();
        //foods akan menyimpan objek dengan tipe data Food 
        //objek arrayList yang baru akan disimpan kedalam variabel foods
        foods.add(burger);
        foods.add(pizza);
        foods.add(steak);

        int total = Restaurant.calculateTotal(foods);

        System.out.println("=".repeat(40));
        System.out.println("Total Harga :\t\t\tRp" + total);
        System.out.println("=".repeat(40));
        System.out.println();
    }
}

