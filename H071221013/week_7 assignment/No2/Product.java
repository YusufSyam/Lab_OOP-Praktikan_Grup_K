package No2;

import java.time.LocalDate;

public class Product<T> {
    String name;
    T price;
    LocalDate expiryDate;

    public Product(String name, T price, LocalDate expiryDate) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
    }    

    public String getName() {
        return name;
    }

    public T getPrice() {
        return price;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }
}

class Main {
    public static void main(String[] args) {    //objek produk
        Product<Integer> p1 = new Product<>("Kinder Joy", 10000, LocalDate.of(2023, 05, 01));
        Product<String> p2 = new Product<>("Sari Roti", "Rp.15.000", LocalDate.of(2023, 05, 20));
        Product<Double> p3 = new Product<>("Susu Kurma", 7.5, LocalDate.of(2023, 06, 01));

        System.out.println("=".repeat(74));
        System.out.println("No.\t " + "\t Name Prodact \t" + "\t Price \t" + " \t\t Expiry \t");
        System.out.println("=".repeat(74));
        System.out.println("Product 1\t: " + p1.getName() + "\t-\t" + "Rp." + p1.getPrice() + "\t-\t" + p1.getExpiryDate());
        System.out.println("Product 2\t: " + p2.getName() + "\t-\t" + p2.getPrice() + "\t-\t" + p2.getExpiryDate());
        System.out.println("Product 3\t: " + p3.getName() + "\t-\t" + "Rp." + p3.getPrice() + "\t\t-\t" + p3.getExpiryDate());
        System.out.println("=".repeat(74));
    }
}