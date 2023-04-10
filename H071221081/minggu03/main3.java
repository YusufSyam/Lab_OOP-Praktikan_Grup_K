
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;
/**
 * main3
 */
public class main3 {
    public static void main(String[] args) {

        User user = new User("Nito", "10k");

        Product p1 = new Product("p1", 1000, 10);
        Product p2 = new Product("p2", 2000, 5);
        Product p3 = new Product("p3", 5000, 1);

        Store t1 = new Store("gak tau kok tanya saya");
        t1.addProduct(p1);
        t1.addProduct(p2);
        t1.addProduct(p3);
        Scanner sc = new Scanner(System.in);
        t1.beliProduk(sc, user);


    }

}

class User {
    String name;
    int balance;

    public User(String name, int balance) {
        this.balance = balance;
        this.name = name;
    }

    public User(String name, String balance) {
        String p = "^[0-9]{1,3}?k$";
        boolean t = Pattern.matches(p, balance);
        if(t){
            int balanceToInt = Integer.parseInt(balance.substring(0,balance.length()-1));
            balanceToInt = balanceToInt * 1000;
            this.balance = balanceToInt;
            this.name = name;
        }
    }

    public int getBalance() {
        return this.balance;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

class Product {
    String name;
    int price, stock;

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Product(String name, String price, int stock) {
        this.name = name;
        this.price = convert(price);
        this.stock = stock;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int convert(String price) {
        String p = "^[0-9]{1,3}?k$";
        boolean t = Pattern.matches(p, price);
        if(t){
            int priceToInt = Integer.parseInt(price.substring(0,price.length()-1));
            priceToInt = priceToInt * 1000;
            return priceToInt;
        }else{
            return 0;
        }
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public int getStock() {
        return this.stock;
    }

    int terjual() {
        if (this.stock == 0) {
            return 0;
        }
        return this.stock -= 1;
    }
}

class Store {
    String name;
    ArrayList<Product> products;

    public Store(String name) {
        this.name = name;
        this.products = new ArrayList<Product>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public int size() {
        return this.products.size();
    }

    public void list() {
        System.out.println("Daftar Produk");
        int nomor = 0;
        for (Product product : products) {
            nomor++;
            System.out.printf("%d. %s - %d | %d \n", nomor, product.getName(), product.getPrice(), product.getStock());
        }
        System.out.println(0 + ". keluar");
    }

    public int lobby(Scanner sc, User user) {
        System.out.printf("%s \n%d \n", user.getName(), user.getBalance());
        list();
        System.out.print(">");
        int indexProduct = sc.nextInt();
        if (indexProduct == 0 || indexProduct > size()) {
            return 0;
        }
        return indexProduct;
    }

    public void beliProduk(Scanner sc, User user) {
        while (true) {

            int indexProduct = lobby(sc, user);
            // sc.nextLine();
            // int indexProduct = sc.nextInt();
            // if (indexProduct == 0 || indexProduct > size()) {
            // return;
            // }
            if (indexProduct == 0) {
                break;
            }

            Product p = products.get(indexProduct - 1);

            System.out.printf("konfirmasi pembelian produk %s seharga %d \n1.Yes\n2.No\n", p.getName(), p.getPrice());
            System.out.print(">");
            int con;
            if (sc.hasNextInt()) {
                con = sc.nextInt();
            } else {
                con = 0;
            }
            System.out.println(con);
            if (con == 1 && user.getBalance() >= p.getPrice()) {
                p.terjual();
                user.setBalance(user.getBalance() - p.getPrice());
                if (p.getStock() == 0) {
                    products.remove(p);
                }
            }else{
                System.out.println("balance tidak cukup");
            }
        }

    }
    // public void beliProduk(User user, Product product) {
    // try {

    // for (Product p : products) {
    // if (p.equals(product)) {
    // if (p.getStock() > 0) {
    // System.out.printf("konfirmasi pembelian produk %s seharga %d \n1.Yes\n2.No",
    // p.getName(),
    // p.getPrice());
    // Scanner sc = new Scanner(System.in);
    // int in = sc.nextInt();
    // sc.close();
    // if(in == 1 && user.getBalance() > p.getPrice()){
    // p.terjual();
    // user.setBalance(user.getBalance()-p.getPrice());
    // if(p.getStock() == 0){
    // products.remove(product);
    // }
    // }
    // return;

    // }

    // }
    // }
    // } catch (Exception e) {

    // }
    // }
}