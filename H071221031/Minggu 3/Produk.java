public class Produk {
    String nama;
    int harga;
    int stock;

    public Produk(){  // constructor default
    }

    public Produk(String nama, int harga, int stock){
        this.nama = nama;
        this.harga = harga;
        this.stock = stock;
    }

    public Produk(String nama, String harga, int stock){
        this.nama = nama;
        this.stock = stock;
        this.harga = Integer.parseInt(harga.substring(0, harga.length() - 1) + "000");
    }

    public String getNama(){
        return nama;
    }

    public int getHarga(){
        return harga;
    }

    public int getStock(){
        return stock;
    }

    public void reduceStock(Store store){
        this.stock--;
    }
}
