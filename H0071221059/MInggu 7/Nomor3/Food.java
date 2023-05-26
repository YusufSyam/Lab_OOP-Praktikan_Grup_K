package Nomor3;

// Buatlah sebuah program sederhana untuk menghitung total harga makanan di
// sebuah restoran. Restoran tersebut menyajikan tiga jenis makanan, yaitu burger,
// pizza, dan steak. Setiap jenis makanan memiliki harga yang berbeda-beda.

// Untuk mengatasi masalah ini, buatlah sebuah factory class bernama
// FoodFactory yang menerapkan polimorfisme. Factory class ini memiliki static
// method getFood() yang menerima satu parameter berupa string yang
// merepresentasikan jenis makanan yang ingin dipesan. Method ini akan
// mengembalikan objek makanan yang sesuai dengan jenisnya.

// Buatlah tiga class yang mewakili masing-masing jenis makanan (Burger, Pizza,
// dan Steak) yang memiliki atribut harga. Setiap class tersebut harus
// mengimplementasikan interface Food yang memiliki method getPrice() untuk
// mengembalikan harga makanan tersebut.

// Setelah itu, buatlah sebuah class Restaurant yang memiliki method static
// calculateTotal() untuk menghitung total harga makanan yang dipesan. Method
// ini akan menerima sebuah list yang berisi objek-objek makanan yang dipesan.

// Class Restaurant ini akan menggunakan factory class FoodFactory untuk
// membuat objek makanan yang sesuai dengan jenis makanan yang dipesan.

import java.util.List;

public interface Food  {
    int getprice();
}

class Burger implements Food {
    private int price;

    public Burger(){

    }

    public Burger(int price){
        this.price = price;
    }

    @Override
    public int getprice() {
        return price;
    }
}

class Pizza implements Food {
    private int price;

    public Pizza(int price){
        this.price = price;
    }

    @Override
    public int getprice() {
        return price;
    }
}

class Steak implements Food {
    private int price;

    public Steak(int price){
        this.price = price;
    }

    public Steak() {
    }

    @Override
    public int getprice() {
        return price;
    }
}

class FoodFactory{
    public static Food  getFood(String type){
        if(type.equalsIgnoreCase("Burger")){
            return new Burger(2000);
        } else if (type.equalsIgnoreCase("Pizza")){
            return new Pizza(5000);
        } else if(type.equalsIgnoreCase("Steak")){
            return new Steak(10000);
        } else {
            return null;
        }
    }
}

class Restaurant  {
    public static int calculateTotal(List<Food> foods) {
        int total = 0;
        for(Food food : foods) {
            total += food.getprice();
        }

        return total;
    }
}
    


