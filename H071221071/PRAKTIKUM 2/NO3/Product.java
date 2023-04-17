public class Product {
    int id;
    String name;
    int stock;
    double price;

//constructor 
    public Product(int id, String name, int stock, double price) { //menginisialisasi nilai awal objek product saat objek tersebut di buat
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public boolean CekStok() {
        return stock > 0;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}



//Constructor adalah sebuah method khusus dalam suatu class yang digunakan untuk menginisialisasi nilai awal dari
// variabel-variabel objek pada saat objek tersebut dibuat. 
//Constructor memiliki nama yang sama dengan nama class-nya dan tidak mengembalikan nilai apapun, termasuk void.