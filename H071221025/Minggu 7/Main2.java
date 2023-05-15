import java.time.LocalDate;
public class Main2 {
    public static void main(String[] args) {
        Product<Integer> product1 = new Product<>("Kinder Joy", 10000, LocalDate.of(2023, 5, 1));
        Product<String> product2 = new Product<>("Sari Roti", "Rp 15000", LocalDate.of(2023, 5, 2));
        Product<Double> product3 = new Product<>("Susu Kurma", 7.5, LocalDate.of(2023, 6, 1));

        System.out.println("Product 1: " + product1.getName() + " - " + product1.getPrice() + " - " + product1.getExpiryDate());
        System.out.println("Product 2: " + product2.getName() + " - " + product2.getPrice() + " - " + product2.getExpiryDate());
        System.out.println("Product 3: " + product3.getName() + " - " + product3.getPrice() + " - " + product3.getExpiryDate());
        System.out.println("=".repeat(80) + "\n");
    }
}
