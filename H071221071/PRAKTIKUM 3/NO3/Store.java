package NO3;

import java.util.ArrayList;
import java.util.Scanner;

class User {
    private String name;
    private int balance;

    
    public User(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
    
    public String getName() {
        return name;
    }
    
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
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
        this.price = convertPrice(price);
        this.stock = stock;
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

    // Metod untuk price dalam bentuk string dengan di akhiri "k", contoh "1k" > 1000
    private int convertPrice(String priceString) {
        if (priceString.endsWith("k")) {
            String priceWithoutK = priceString.replace("k", "");
            return Integer.parseInt(priceWithoutK) * 1000;
        } else {
            return Integer.parseInt(priceString);
        }
    }

    public void reduceStock() {
        stock--;
    }
}

public class Store {
    private String name;
    private ArrayList<Product> products;
    
    public String getName() {
        return name;
    }

    public Store(String name) {
        this.name = name;
        products = new ArrayList<Product>();
    }

    // metod menambah product ke dalam list
    public void tambahProduct(Product product) {
        products.add(product);
    }

    // metod untuk menampilkan keseluruhan produk dalam list
    public void daftarProduct() {
        System.out.println("Daftar Produk:");
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getStock() > 0) {
                System.out.println((i+1) + ". " + product.getName() + " - $" + product.getPrice() + " | Stok " + product.getStock());
            }
        }
    }
    
    public void tranksaksi(User user, int productIndex) {
        Product product = products.get(productIndex);
        // Kondisi yang tidak memungkinkan produk habis atau uang tidak cukup
        if (product.getStock() == 0) {
            System.out.println("Maaf, produk ini sudah habis");
            return;
        }
        if (user.getBalance() < product.getPrice()) {
            System.out.println("Maaf, saldo anda tidak cukup untuk membeli produk ini");
            return;
        }

        // Konfirmasi pembelian produk
        Scanner scanner = new Scanner(System.in);
        System.out.println("Apakah anda yakin ingin membeli:");
        System.out.println(product.getName() + ", dengan harga $" + product.getPrice());
        System.out.println("1. Konfirmasi \n2. Batal");
        System.out.print("> ");
        String konfirmasi = scanner.nextLine();
        if (konfirmasi.equalsIgnoreCase("1")) {
            user.setBalance(user.getBalance() - product.getPrice());
            product.reduceStock();
            System.out.println(user.getName() + " berhasil membeli " + product.getName() + ".");
        } else {
            System.out.println("Pembelian dibatalkan");
        }
    }
    
    public static void main(String[] args) {
        User user = new User("Rama", 3000);
        Store store = new Store("Sisfo Computer");
        store.tambahProduct(new Product("HP Pavilion Gaming 15", "2k", 15));
        store.tambahProduct(new Product("Asus VivoBook 15 A516MAO N4020", "4k", 4));
        store.tambahProduct(new Product("Lenovo IdeaPad S145", 1500, 2));
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Info nama dan uang milik user
            System.out.println("-----------CARD-----------");
            System.out.println(user.getName());
            System.out.println(user.getBalance());
            System.out.println("--------------------------");
            
            // Info nama toko dan daftar produk yang tersedia
            System.out.println("Selamat Datang di " + store.getName());
            store.daftarProduct();
            System.out.println("0. Keluar");
            System.out.print("> ");
            int productIndex = scanner.nextInt() - 1;
            if (productIndex >= 0) {
                store.tranksaksi(user, productIndex);
            } else {
                break;
            }

            // Melanjutkan pembelian atau tidak
            System.out.println("--------------------");
            System.out.println("Lanjutkan Tranksaksi? \n1. Iya \n2. Tidak");
            System.out.print("> ");
            String lanjut = scanner.next();
            if (lanjut.equalsIgnoreCase("2")) {
                break;
            }
        }
        // akhir dari program
        System.out.println("Terima kasih telah berbelanja di toko kami! ");
        scanner.close();
    }   
}
