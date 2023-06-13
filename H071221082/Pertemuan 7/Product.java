public class Product<T>{
    private String name, expiryDate;
    private T price;

    public Product(String name, T price, String expiryDate){
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

    public String getExpiryDate() {
        return expiryDate;
    }

    public static void main(String[] args) {
        Product<Integer> product1 = new Product<Integer>("Pocari Sweet", 6000, "23-05-2025");
        Product<String> product2 = new Product<String>("Chitato", "Rp. 11000", "25-01-2024");
        Product<Double> product3 = new Product<Double>("Coca-Cola", 5.5, "26-10-2023");

        System.out.println("========== Daftar Produk ==========");
        System.out.printf("Product 1: %s - %d - %s\n", product1.getName(), product1.getPrice(), product1.getExpiryDate());
        System.out.printf("Product 2: %s - %s - %s\n", product2.getName(), product2.getPrice(), product2.getExpiryDate());
        System.out.printf("Product 3: %s - %.1f - %s", product3.getName(), product3.getPrice(), product3.getExpiryDate());
    }
}