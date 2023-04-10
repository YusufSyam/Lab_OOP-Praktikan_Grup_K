public class Product {
    String name;
    int harga;
    int stock;

    public Product() {
    }

    public Product(String name, int harga, int stock) {
        this.name = name;
        this.harga = harga;
        this.stock = stock;
    }

    public Product(String name, String harga, int stock){
        this.name = name;
        this.stock = stock;
        this.harga = Integer.parseInt(harga.substring(0, harga.length() - 1) + "000");
        // int hargaBaru = Integer.parseInt(harga.replaceAll("k", ""));
        // hargaBaru*=1000;
        // this.harga = hargaBaru;

    }

    public String getName() {
        return name;
    }

    public int getharga() {
        return harga;
    }

    public int getStock() {
        return stock;
    }

    public void reduceStock(Store store) {
        this.stock--;
    }

}

