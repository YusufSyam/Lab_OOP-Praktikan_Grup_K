import java.util.ArrayList;
import java.util.Scanner;
public class Store {
    String nama;
    ArrayList<Produk> produk;

    public Store(){

    }

    public Store(String nama, ArrayList<Produk> produk){
        this.nama = nama;
        this.produk = produk;
    }

    public String getNama(){
        return nama;
    }

    public ArrayList<Produk> getProduk(){
        return produk;
    }

    public void ListProduk() {
        int i = 1;
        System.out.printf("Selamat datang di %s%nDaftar produk:%n", this.getNama());
        for (Produk produk : this.produk) {
            System.out.printf("%d. %s - $%d | Stok %d%n", i, produk.getNama(), produk.getHarga(), produk.getStock());
            i++;
        }
        System.out.println("0, Keluar");
    }

    public void addProduk(Produk produk){
        this.produk.add(produk);
    }
}
