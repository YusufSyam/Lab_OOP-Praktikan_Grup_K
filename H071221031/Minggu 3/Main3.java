import java.util.Scanner;
import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        User user = new User("Aan", 3000); // add User

        ArrayList<Produk> produk = new ArrayList<>(); // Menambahkan produk untuk HND, Produk disimpan dalam ArrayList dengan type Product.
        produk.add(new Produk("HP pavilion Gaming 15", "2k", 1));
        produk.add(new Produk("ASUS VivoBook 15 A516MAO N4020", "4k", 8));
        produk.add(new Produk("Lenovo IdeaPad S145", 1500 , 10));

        Store HND = new Store("HND", produk); // Instance class Store

        while (true) { // Loop 1

            user.card(); // Menampilkan data User
            HND.ListProduk(); // Menampilkan list Product
            System.out.print("> ");
            int pilihan1 = input.nextInt();

            if (pilihan1 > HND.getProduk().size()) { // Opsi yang diinput melebihi jumlah produk
                System.out.println("-".repeat(40));
                System.out.println("Tidak ada dalam pilihan!");


            } else if (1 <= pilihan1 && pilihan1 <= produk.size()) { // Opsi yang diinput pas dengan jumlah produk
                System.out.println("-".repeat(40)); // garis
                System.out.println("Apakah anda yakin ingin membeli:");
                System.out.printf("%s, dengan Harga $%d%n", HND.getProduk().get(pilihan1 - 1).getNama(), HND.getProduk().get(pilihan1 - 1).getHarga());
                System.out.println("-".repeat(40));

                while (true) { 

                    System.out.printf("1. Konfirmasi%n2. Batal%n");
                    System.out.print("> ");
                    int konfirmasi = input.nextInt();

                    if (konfirmasi == 1 && user.getBalance() >= HND.getProduk().get(pilihan1 - 1).getHarga()) { // inputan 1 dan jumlah balance user cukup untuk membeli produk

                        System.out.println("-".repeat(40));
                        HND.getProduk().get(pilihan1 - 1).reduceStock(HND); // Mengurangi jumlah stok dan pengecekan jika stok = 0, maka laptop akan di-remove dari list product
                        user.setBalance(HND.getProduk().get(pilihan1 - 1).getHarga()); // Menyesuaikan Balance dari user setelah transaksi berhasil

                        System.out.printf("%s berhasil membeli %s.%n", user.getName(), HND.getProduk().get(pilihan1 - 1).getNama());
                        System.out.println("-".repeat(40));
                        System.out.printf("Lanjutkan Transaksi%n1. Iya%n2. Tidak%n");
                        System.out.print("> ");
                        int pilihan2 = input.nextInt();

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
                        System.out.printf("Informasi : Balance Anda = $%d | harga laptop = $%d | %s%n", user.getBalance(), HND.getProduk().get(pilihan1 - 1).getHarga(), (user.getBalance() < HND.getProduk().get(pilihan1 - 1).getHarga()) ? "Silahkan Batalkan pesanan, Balance anda tidak cukup" : "Masukkan Perintah Dengan Benar!");
                    }
                }

            } else {
                System.out.println("Terima Kasih Telah Berkunjung");
                break;
            }

        }

        input.close();
    }
    }

