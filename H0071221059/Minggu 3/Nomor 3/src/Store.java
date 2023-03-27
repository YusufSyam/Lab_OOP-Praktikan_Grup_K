import java.util.ArrayList;

public class Store {
    private String name;
    private ArrayList<Product> products = new ArrayList<Product>();

    public Store(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void displayProducts() {
        System.out.println("Daftar Produk");
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getStock() > 0) {
                System.out.println((i+1) + ". " + product.getName() + " - $" + product.getPrice() + "   / Stok " + product.getStock());
            } else {
                products.remove(product);
                i--;
            }
        }
    }

    public boolean processTransaction(User user, int productIndex) {
        Product product = products.get(productIndex);
        if(product.getStock()<=0) {
            return false;
        }

        int productPrice = product.getPrice();
        if (user.getBalance() < productPrice) {
            return false;
        }
        user.setBalance(user.getBalance() - productPrice);
        product.sellProduct();
        if(product.getStock() == 0) {
            products.remove(product);
        }
        return true;
    }
}
