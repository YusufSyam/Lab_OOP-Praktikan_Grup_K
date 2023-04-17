public class produk {
    int id;
    String nama;
    int stock;
    int harga;

    // untuk membuat objek dengan 4 atribut
    public produk (int id, String nama, int stock, int harga) {
        this.id = id ;
        this.nama = nama ;
        this.stock = stock;
        this.harga = harga ;
    }

    // get untuk mengakses nilai atribut
    // retrurn untuk memuculkan nilai atribut
    public int getId(){
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getStock() {
        return stock;
    }

    public int getHarga() {
        return harga;
    }
    //isAvailable untuk mengecek apakah produk itu masih ada atau tidak
    public boolean isAvailable(){
        return stock >0;
    }


public static void main(String[] args) {
    // Membuat produk
    produk produk1 = new produk(62, "Sepatu Hyperblast", 0, 450000 );
    

    // Menampilkan data
    System.out.println("ID produk: " + produk1.getId());
    System.out.println("Nama Produk: " + produk1.getNama());
    System.out.println("Jumlah Stock: " + produk1.getStock());
    System.out.println("Harga :" + produk1.getHarga());

    // pengecekan stok
    if (produk1.isAvailable()) {
        System.out.println("Produk tersedia");
    } else {
        System.out.println("Produk Habis");
    }
}
}






