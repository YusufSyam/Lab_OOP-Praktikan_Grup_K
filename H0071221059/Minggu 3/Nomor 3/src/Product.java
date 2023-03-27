public class Product {
    private String name;
    private int price;
    private int stock;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Product(String name, String price, int stock) {
        this.name = name;
        this.stock = stock;
        this.price = Integer.parseInt(price.replaceAll("[^0-9]",""));
        if(price.contains("k")) {
            this.price *= 1000;
        }

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

    public void sellProduct() {
        stock--;
    }

    public int getPriceValue() {
        return price;
    }

    public void sell() {
        stock--;
    }
}


