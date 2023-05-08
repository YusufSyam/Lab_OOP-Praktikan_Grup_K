import java.util.List;
interface Food {
    int getPrice();
}

class Burger implements Food {
    private int price = 50000;

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
    private int price = 100000;

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
    public static int calculateTotal(List<Food> foods) { // method untuk menghitung total harga makanan
        int total = 0; // inisialisasi variabel total dengan nilai 0
        for(Food food : foods) { // loop untuk mengakses setiap elemen pada list foods
            total += food.getPrice(); // menambahkan harga makanan ke dalam variabel total
        }
        return total; // mengembalikan nilai total harga makanan
    }
}

