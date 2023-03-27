public class Produk {
    String idProduk;
    String nama;
    int stok;
    int harga;

    // Constructor untuk menginisialisasi atribut-atribut produk
    public Produk(String idProduk, String nama, int stok, int harga) {
        this.idProduk = idProduk;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }
    
    // Method untuk mendapatkan ID produk
    String getIdProduk() {
        return idProduk;
    }

    // Method untuk mendapatkan nama produk
    String getNama() {
        return nama;
    }

    // Method untuk mendapatkan stok produk
    public int getStok() {
        return stok;
    }

    // Method untuk mendapatkan harga produk
    int getHarga() {
        return harga;
    }
    // Method untuk menambah stok produk
    public void tambahStok(int jumlah) {
        stok += jumlah;
    }

    // Method untuk mengurangi stok produk
    public void kurangiStok(int jumlah) {
        stok -= jumlah;
    }

    // Method untuk melakukan pengecekan ketersediaan stok produk
    public boolean cekStok() {
        return (stok > 0);
    }

    // Method untuk menampilkan informasi produk
    void tampilkanInfo() {
        System.out.println("ID Produk: " + idProduk);
        System.out.println("Nama Produk: " + nama);  
        System.out.println("Stok: " + stok);
        System.out.println("Harga: " + harga);
        if (stok <= 0) {
            System.out.println("Stok produk sudah habis.");
        } else {
            System.out.println("Stok produk masih tersedia.");
        }
    }
    
    public static void main(String[] args) {
        Produk produk1 = new Produk("C02", "Indomie", 0, 3000);
        produk1.tampilkanInfo();
        Produk produk2 = new Produk("S01", "Sari Roti", 5, 6000);
        produk2.tampilkanInfo();
    }

}