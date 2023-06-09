public class Product<M> {
    private String name, expiryDate;
    private M price;

    public Product() {
        
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
    public M getPrice() {
        return price;
    }

    public void setPrice(M price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Product<Integer> produk1 = new Product<Integer>();
        produk1.setName("Better");
        produk1.setPrice(2000);
        produk1.setExpiryDate("10-05-2025");

        Product<String> produk2 = new Product<String>();
        produk2.setName("Kusuka");
        produk2.setPrice("Rp. 11.500");
        produk2.setExpiryDate("25-05-2025");

        Product<Double> produk3 = new Product<Double>();
        produk3.setName("Sirup Anggur");
        produk3.setPrice(15.99);
        produk3.setExpiryDate("01-01-2031");

        System.out.println("Produk 1 = " + produk1.getName() + " - " + produk1.getPrice() + " , " + produk1.getExpiryDate());
        System.out.println("Produk 2 = " + produk2.getName() + " - " + produk2.getPrice() + " , " + produk2.getExpiryDate());
        System.out.printf("Produk 3 = %s - %.1f , %s ", produk3.getName(), produk3.getPrice(), produk3.getExpiryDate());
    }
    
}
