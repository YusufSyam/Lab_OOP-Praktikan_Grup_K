import java.time.LocalDate;
//digunakan untuk merepresentasikan sebuah tanggal dalam sistem kalender. 
import java.time.format.DateTimeFormatter;
/* digunakan untuk memformat tanggal dan waktu dalam sebuah string menjadi format yg diinginkan */

public class Product <T> {
    /* generic class digunakan untuk membuat kelas yang bekerja dengan jenis data yg berbeda-beda */
    private String name;
    private T price;
    // price disini yang bertipe T (tipe data generik)
    private LocalDate expiryDate;
    // expiryDate yg bertipe "LocalDate" (kls dlm paket java.time utk merepresentasikan tanggal)

    //constructor 
    public Product(String name, T price, String expiryDate) {
        this.name = name ;
        this.price = price ;
        this.expiryDate = LocalDate.parse (expiryDate, DateTimeFormatter.ofPattern("dd-MM-yyyy")) ;
        /* LocalDate.parse adalah method pd kls LocalDate yg digunakan utk mengubah string yg 
        merepresentasikan tgl dlm format tertentu. 

         * nilai parameter "expiryDate" yg berupa String akan diubah ke dlm format LocalDate menggunakan
         * DateTimeFormatter.ofPattern dan setelah itu nilai variabel LocalDate tersebut 
         * akan diset ke dalam atribut "expiryDate" pada kelas "Product" menggunakan "this.expiryDate =".
         */
    }

    //method
    public String getName() {
        return name ;
    }

    public T getPrice() {
        return price ;
    }

    public LocalDate getExpiryDate() {
        return expiryDate ;
    }

    public static void main(String[] args) {

        //membuat instance dari objek dari class Product dgn menggunakan tiga generic yg berbeda
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        Product<Integer> prod1 = new Product<Integer>("Kinder Joy", 10000, "29-03-2023");
        Product<String> prod2 = new Product<String>("Sari Roti", "Rp.15000", "29-03-2024");
        Product<Double> prod3 = new Product<Double>("Susu Kurma", 7.5 , "29-03-2025");
        Product<Boolean> prod4 = new Product<Boolean>("Susu Kurma", true , "29-03-2025");
    
        System.out.println(" Product 1 : " + prod1.getName() + " - " + prod1.getPrice() + " - " + prod1.getExpiryDate().format(format));
        System.out.println(" Product 2 : " + prod2.getName() + " - " + prod2.getPrice() + " - " + prod2.getExpiryDate().format(format));
        System.out.println(" Product 3 : " + prod3.getName() + " - " + prod3.getPrice() + " - " + prod3.getExpiryDate().format(format));
        System.out.println(" Product 4 : " + prod4.getName() + " - " + prod4.getPrice() + " - " + prod4.getExpiryDate().format(format));
        /* Pada kode tersebut, "format" adalah objek formatter yang
        digunakan untuk mengubah tanggal kedaluwarsa menjadi string dengan format tertentu. 
        prod1.getExpiryDate() mengembalikan nilai objek LocalDate, dan kemudian 
        method .format(format) digunakan untuk memformat tanggal kedaluwarsa 
        ngan menggunakan objek formatter yang telah didefinisikan sebelumnya. 
        Hasil akhirnya adalah tanggal yang sudah diformat menjadi string dengan format tertentu,
        kemudian dihasilkan sebagai output pada baris kode tersebut. */
    
    }   
}