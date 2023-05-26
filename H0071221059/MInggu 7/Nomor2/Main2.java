package Nomor2;

public class Main2 {
    public static void main(String[] args) {
        Product<Integer> product1 = new Product<>("Kinder Joy", 100000, "2023-05-01");
        Product<String> product2 = new Product<>("Sari Roti", "15.000", "2023-05-20");
        Product<Double> product3 = new Product<>("Sari Roti", 2.50, "2023-06-01");
        
        System.out.println("Product 1: " + product1.getName() + " - " + product1.getPrice() + " - " + product1.getExpiryDate());
        System.out.println("Product 2: " + product2.getName() + " - " + product2.getPrice() + " - " + product2.getExpiryDate());
        System.out.println("Product 3: " + product3.getName() + " - " + product3.getPrice() + " - " + product3.getExpiryDate());
    }
}
