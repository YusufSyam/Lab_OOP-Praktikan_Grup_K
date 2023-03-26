public class No3 {
    public static void main(String[] args) {
        Produk produk = new Produk("219203", "Sari Roti", 0, 5000);

        produk.cekData();
        System.out.println(produk.stokTersedia());
    }
}

class Produk {
    String id, nama;
    int stok;
    double harga;

    public Produk(String id, String nama, int stok, double harga) {
        this.id = id;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }
    public void cekData() {
        System.out.println("ID Produk: "+ this.id);
        System.out.println("Nama Produk: "+ this.nama);
        System.out.println("Stok: "+ this.stok);
        System.out.println("Harga: "+ this.harga);
    }
 
    public String stokTersedia() {
        if (this.stok > 0) {
            return "Produk Tersedia";
        }
        return "Produk Tidak Tersedia";
    }
}