import java.util.Scanner;
import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        User user = new User("Rezqia", 10_000); // add User

        ArrayList<Product> produk = new ArrayList<>(); // Menambahkan produk untuk sisfoKomputer, Produk disimpan dalam ArrayList dengan type Product.
        produk.add(new Product("HP pavilion Gaming 15", "2k", 1));
        produk.add(new Product("ASUS VivoBook 15 A516MAO N4020", "4k", 8));
        produk.add(new Product("Lenovo IdeaPad S145", 1500 , 10));

        Store sisfoKomputer = new Store("Sisfo Komputer", produk); // Instance class Store
        sisfoKomputer.addProduct(new Product("Mac", "10K", 12));

        while (true) { // Loop 1

            user.card(); // Menampilkan data User
            sisfoKomputer.listProduct(); // Menampilkan list Product
            System.out.print("> ");
            int pilihan1 = inp.nextInt();

            if (pilihan1 > sisfoKomputer.getProduct().size()) { // Opsi yang diinput melebihi jumlah produk
                System.out.println("-".repeat(40));
                System.out.println("Tidak ada dalam pilihan!");


            } else if (1 <= pilihan1 && pilihan1 <= produk.size()) { // Opsi yang diinput pas dengan jumlah produk
                System.out.println("-".repeat(40)); // garis
                System.out.println("Apakah anda yakin ingin membeli:");
                System.out.printf("%s, dengan Harga $%d%n", sisfoKomputer.getProduct().get(pilihan1 - 1).getName(), sisfoKomputer.getProduct().get(pilihan1 - 1).getharga());
                System.out.println("-".repeat(40));

                while (true) { // Loop 2

                    System.out.printf("1. Konfirmasi%n2. Batal%n");
                    System.out.print("> ");
                    int konfirmasi = inp.nextInt();

                    if (konfirmasi == 1 && user.getBalance() >= sisfoKomputer.getProduct().get(pilihan1 - 1).getharga()) { // inputan 1 dan jumlah balance user cukup untuk membeli produk

                        System.out.println("-".repeat(40));
                        sisfoKomputer.getProduct().get(pilihan1 - 1).reduceStock(sisfoKomputer); // Mengurangi jumlah stok dan pengecekan jika stok = 0, maka laptop akan di-remove dari list product
                        user.setBalance(sisfoKomputer.getProduct().get(pilihan1 - 1).getharga()); // Menyesuaikan Balance dari user setelah transaksi berhasil

                        System.out.printf("%s berhasil membeli %s.%n", user.getName(), sisfoKomputer.getProduct().get(pilihan1 - 1).getName());
                        System.out.println("-".repeat(40));
                        System.out.printf("Lanjutkan Transaksi%n1. Iya%n2. Tidak%n");
                        System.out.print("> ");
                        int pilihan2 = inp.nextInt();

                        if (pilihan2 == 1) { // Break Loop 2
                            break;

                        } else {
                            System.exit(0);  // Menghentikan seluruh Loop / return 0
                            System.out.println("Terima Kasih Telah Berkunjung"); 
                        } 

                    } else if (konfirmasi == 2) { // Opsi batalkan transaksi (Break Loop 2)
                        break;

                    } else {
                        System.out.println("-".repeat(40));
                        System.out.printf("Informasi : Balance Anda = $%d | harga laptop = $%d | %s%n", user.getBalance(), sisfoKomputer.getProduct().get(pilihan1 - 1).getharga(), (user.getBalance() < sisfoKomputer.getProduct().get(pilihan1 - 1).getharga()) ? "Silahkan Batalkan pesanan, Balance anda tidak cukup" : "Masukkan Perintah Dengan Benar!");
                    }
                }

            } else {
                System.out.println("Terima Kasih Telah Berkunjung");
                break;
            }

        }

        inp.close();
    }
}