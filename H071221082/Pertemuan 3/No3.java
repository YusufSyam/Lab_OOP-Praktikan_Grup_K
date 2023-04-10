import java.util.Scanner;
import java.util.ArrayList;

class User {
    private String name;
    private int balance;

    public User(String name, int balance){
        this.name = name;
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public void reduceBalance(int balance) {
        this.balance = this.balance - balance;
    }
    public void userCard(){
        System.out.println("======== CARD ========");
        System.out.println("Nama    : " + this.getName());
        System.out.println("Saldo   : " + this.getBalance());
        System.out.println("======================\n");
    } 
}

class Product {
    private String name;
    private int price;
    private int stock;

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    public Product(String name, String price, int stock) {
        this.name = name;
        this.stock = stock;
        
        if (price.contains("k")) {
            price = price.replace("k", "");
            this.price = Integer.parseInt(price) * 1000;
        } else {
            this.price = Integer.parseInt(price);
        }
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }
    public void sell() {
        stock--;
    }
}
class Store {
    public String name;
    public ArrayList<Product> products;

    public Store(String name, ArrayList<Product> product){
        this.name = name;
        this.products = product;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void listProducts() {
        System.out.printf("Selamat Datang di %s%n", this.name);
        System.out.println("Daftar Produk :");
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.println((i + 1) + ". " + product.getName() + " - Rp." + product.getPrice() + " | stok " + product.getStock());
        }
    }
    public void buyProduct(User user, int productIndex) {
        Product product = products.get(productIndex);
        if (user.getBalance() >= product.getPrice()) {
            user.reduceBalance(product.getPrice());
            product.sell();

            if (product.getStock() == 0) {
                products.remove(productIndex);
            }
            System.out.println(user.getName() + " berhasil membeli " + product.getName());

        } else {
            System.out.println("Saldo anda tidak cukup");
        }
    }
}
public class No3 {
    public static void main(String[] args) {
        User user = new User("Zul", 500000);
        ArrayList<Product> product = new ArrayList<>();
        product.add(new Product("Martabak Telur", "250k", 5));
        product.add(new Product("Martabak Manis", "20k", 3));
        product.add(new Product("Pop Ice", 5000, 10));

        Store toko = new Store("CornerID", product);

        Scanner input = new Scanner(System.in);

        while (true) {
            user.userCard();
            toko.listProducts();
            System.out.println("0. Keluar");
            System.out.print("=> ");
            int pilihan = input.nextInt();
            
            if (pilihan >= 1 && pilihan <= toko.products.size()) {
                while (true) {
                    System.out.println("Apakah anda yakin ingin membeli?");
                    System.out.println("1. Iya");
                    System.out.println("2. Tidak");
                    System.out.print("=> ");
                    int konfirmasi = input.nextInt();
                    if (konfirmasi == 1 ){
                            toko.buyProduct(user, pilihan-1);
                            break;
                    } else {
                        break;
                    }
                }
            } else {break;}
        }
            input.close();
    }
}    

