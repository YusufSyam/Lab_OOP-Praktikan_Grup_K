class Product<T> {
    protected String name;
    protected T price;
    protected String ExpiryDate;

    public Product(String name, T price, String expiryDate) {
        this.name = name;
        this.price = price;
        ExpiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getPrice() {
        return price;
    }

    public void setPrice(T price) {
        this.price = price;
    }

    public String getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        ExpiryDate = expiryDate;
    }

}

class Main {
    public static void main(String[] args) {
        Product<Integer> product1 = new Product<>("Kinder Joy", 10000, "2023-05-1");
        Product<String> product2 = new Product<>("Sari Roti", "Rp 15.000", "2023-05-20");
        Product<Double> product3 = new Product<>("Susu Kurma", 7.5, "2023-06-1");

        System.out.println(
                "Product 1 : " + product1.getName() + " - " + product1.getPrice() + " - " + product1.getExpiryDate());
        System.out.println(
                "Product 1 : " + product2.getName() + " - " + product2.getPrice() + " - " + product2.getExpiryDate());
        System.out.println(
                "Product 1 : " + product3.getName() + " - " + product3.getPrice() + " - " + product3.getExpiryDate());
        
        
    }
}
