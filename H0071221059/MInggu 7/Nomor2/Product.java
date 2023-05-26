package Nomor2;

// Seorang developer sedang membuat sebuah program yang menyimpan
// informasi tentang produk, harga, dan tanggal kadaluarsa dari produk tersebut.

// Namun, masalahnya adalah tipe data dari harga bisa berbeda-beda, seperti
// integer, string, atau double. Untuk mengatasi hal ini, dia memutuskan untuk
// menggunakan sebuah kelas generik yang disebut "Product".

// Buatlah sebuah kode untuk kelas "Product" generik yang dapat menyimpan
// informasi tentang produk, harga, dan tanggal kadaluarsa dari produk tersebut.

// Anda juga diminta untuk menambahkan constructor untuk menginisialisasi
// objek "name", "price", dan "expiryDate", serta getter method untuk mengakses
// nilai dari objek tersebut.

// Setelah itu, implementasikanlah kelas "Product" tersebut pada sebuah method
// main dan tambahkan beberapa objek "Product" dengan harga yang
// berbeda-beda, seperti integer, string, atau double. Kemudian, cetak informasi
// tentang setiap produk dan harganya.

public class Product<T>{
    private String name;
    private T price;
    private String expiryDate;


    public Product(String name, T price, String expiryDate) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
    }


    public String getName() {
        return name;
    }


    public T getPrice() {
        return price;
    }

    public String getExpiryDate() {
        return expiryDate;
    }
}

