//Semisal terdapat produk yang akan digunakan oleh
//sebuah toko dimana produk ini nantinya memiliki ID,
//nama, stok, dan harga, kemudian dapat dilakukan
//pengecekan semua data produk tersebut ditambah
//pengecekan apakah produknya tersedia di stok atau tidak.
//Silahkan buatkan class yang dapat merepresentasikan
//objek produk tersebut!
public class Produk {
    private String ID;
    private String nama;
    private int stok;
    private double harga;

    public Produk(String ID, String nama, int stok, double harga) {
        this.ID = ID;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    public void cekDataProduk() {
        System.out.println("ID Produk: " + this.ID);
        System.out.println("Nama Produk: " + this.nama);
        System.out.println("Harga Produk: " + this.harga);
        System.out.println("Stok Produk: " + this.stok);
    }

    public void cekStokProduk() {
        if(this.stok > 0) {
            System.out.println("Produk " + this.nama + " tersedia di stok.");
        } else {
            System.out.println("Produk " + this.nama + " tidak tersedia di stok");
        }
    }

    public static void main(String[] args) {
        //membuat objek produk baru
        Produk produk1 = new Produk("P001", "Baju", 10, 100000);
        Produk produk2 = new Produk("P002", "Celana", 0, 150000);

        //mengecek data produk
        System.out.println("Data produk 1:");
        produk1.cekDataProduk();

        System.out.println("Data produk 2:");
        produk2.cekDataProduk();

        //mengecek stok produk
        System.out.println("Data produk 1:");
        produk1.cekStokProduk();


        System.out.println("Data produk 2:");
        produk2.cekStokProduk();

    }
}
