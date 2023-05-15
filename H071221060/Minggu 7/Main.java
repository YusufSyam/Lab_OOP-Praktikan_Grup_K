import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        Food burger = FoodFactory.getFood("burger");
        Food pizza = FoodFactory.getFood("pizza");
        Food steak = FoodFactory.getFood("steak");

        List<Food> foods = new ArrayList<>();
        foods.add(burger);
        foods.add(pizza);
        foods.add(steak);

        int total = Restaurant.calculateTotal(foods);

        System.out.println("Total price: " + total);
    }
}

/* Kode di atas merupakan contoh implementasi dari kelas "Restaurant" yang telah 
didefinisikan sebelumnya dengan menambahkan kelas "FoodFactory" dan kelas "Food". 
Pada kode ini, kita membuat tiga objek makanan yaitu burger, pizza dan steak menggunakan 
metode statis "getFood()" pada kelas "FoodFactory".Kemudian, kita membuat ArrayList bernama "foods" 
untuk menampung objek-objek makanan tersebut. Setelah itu, kita memanggil method "calculateTotal()"
pada kelas "Restaurant" dengan argumen "foods" dan menyimpan hasilnya ke variabel "total".
Terakhir, kita mencetak total harga makanan menggunakan perintah "System.out.println()" dengan
menggabungkan string "Total price: " dengan nilai dari variabel "total". */