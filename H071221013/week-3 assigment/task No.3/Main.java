import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        User user = new User("Santi", 5_000); 

        ArrayList<Product> produk = new ArrayList<>();
        produk.add(new Product("HP pavilion Gaming 15", "2k", 5));
        produk.add(new Product("ASUS VivoBook 15 A516MAO N4020", "4k", 8));
        produk.add(new Product("Lenovo IdeaPad S145", 1500 , 3));

        Store sisfoKomputer = new Store("Sisfo Komputer", produk); 
        sisfoKomputer.addProduct(new Product("Mac", "10K", 12));

        while (true) { 

            user.card(); 
            sisfoKomputer.listProduct(); 
            System.out.print("> ");
            int pilihan1 = inp.nextInt();

            if (pilihan1 > sisfoKomputer.getProduct().size()) { 
                System.out.println("-".repeat(40));
                System.out.println("Tidak ada dalam pilihan!");


            } else if (1 <= pilihan1 && pilihan1 <= produk.size()) { 
                System.out.println("-".repeat(40)); 
                System.out.println("Apakah anda yakin ingin membeli:");
                System.out.printf("%s, dengan Harga $%d%n", sisfoKomputer.getProduct().get(pilihan1 - 1).getName(), sisfoKomputer.getProduct().get(pilihan1 - 1).getPrice());
                System.out.println("-".repeat(40));

                while (true) { 

                    System.out.printf("1. Konfirmasi%n2. Batal%n");
                    System.out.print("> ");
                    int konfirmasi = inp.nextInt();

                    if (konfirmasi == 1 && user.getBalance() >= sisfoKomputer.getProduct().get(pilihan1 - 1).getPrice()) { 

                        System.out.println("-".repeat(40));
                        sisfoKomputer.getProduct().get(pilihan1 - 1).reduceStock(sisfoKomputer); 
                        user.setBalance(sisfoKomputer.getProduct().get(pilihan1 - 1).getPrice()); 
                        System.out.printf("%s berhasil membeli %s.%n", user.getName(), sisfoKomputer.getProduct().get(pilihan1 - 1).getName());
                        System.out.println("-".repeat(40));
                        System.out.printf("Lanjutkan Transaksi%n1. Iya%n2. Tidak%n");
                        System.out.print("> ");
                        int pilihan2 = inp.nextInt();

                        if (pilihan2 == 1) { 
                            break;

                        } else {

                            System.out.println("Terima Kasih Telah Berkunjung");
                            System.exit(0); 
                        }

                    } else if (konfirmasi == 2) { 
                        break;

                    } else {
                        System.out.println("-".repeat(40));
                        System.out.printf("Informasi : Balance Anda = $%d | harga laptop = $%d | %s%n", user.getBalance(), sisfoKomputer.getProduct().get(pilihan1 - 1).getPrice(), (user.getBalance() < sisfoKomputer.getProduct().get(pilihan1 - 1).getPrice()) ? "Silahkan Batalkan pesanan, Balance anda tidak cukup" : "Masukkan Perintah Dengan Benar!");
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