import java.util.ArrayList;

public class Store {
    String name;
    ArrayList<Product> product; 

    public Store() {
    }

    public Store(String name, ArrayList<Product> product) {
        this.name = name;
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Product> getProduct() {
        return product;
    }

    public void listProduct() {
        int i = 1;
        System.out.printf("Selamat datang di %s%nDaftar produk:%n", this.getName());
        for (Product produk : this.product) {
            System.out.printf("%d. %s - $%d | Stok %d%n", i, produk.getName(), produk.getPrice(), produk.getStock());
            i++;
        }
        System.out.println("0. Keluar");
    }
    public void addProduct(Product product){
        this.product.add(product);
    }

}