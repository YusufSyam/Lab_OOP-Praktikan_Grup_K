public class Produk{
    String id_produk;
    String nama;
    int stok;
    int harga;

    public Produk(String idProduk, String namaProduk, int stokProduk, int hargaProduk) {
        id_produk = idProduk;
        nama = namaProduk;
        stok = stokProduk;
        harga = hargaProduk;
    }
    String getIdProduk() {
        return id_produk;
    }
    String getNama() {
        return nama;
    }
    public int getStok() {
        return stok;
    }
    int getHarga() {
        return harga;
    }
    public boolean cekStok() {
        return (stok > 0);
    }
    void detail() {
        System.out.println("Id Produk   : " + id_produk);
        System.out.println("Nama Produk : " + nama);  
        System.out.println("Stok        : " + stok);
        System.out.println("Harga       : " + harga);
        if (stok <= 0) {
            System.out.println("Produk Tidak Tersedia");
        } else {
            System.out.println("Produk Masih Tersedia");
        }
    }
    public static void main(String[] args) {
        System.out.println("===========================");
        Produk produk1 = new Produk("Cuck5", "Frisian Flag", 0, 7000);
        produk1.detail(); 
        System.out.println("===========================");
        Produk produk2 = new Produk("dODp6", "Milo", 12, 22000);
        produk2.detail();
        System.out.println("===========================");
    }
}