import java.util.ArrayList;
import java.util.Scanner;

public class SimpleStoreApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user = new User("Ikhsan", 3000);
        Store store = new Store("sisfo computer");

        Product product1 = new Product("HP Pavilion Gaming 15", "$2000", 15);
        Product product2 = new Product("Asus Vivobook 15 A516MAO N4020", "$500", 4);
        Product product3 = new Product("Lenovo IdeaPad s145", "$1500", 2);
        Product product4 = new Product("Asus X415", "800", 10);

        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);
        store.addProduct(product4);


        while (true) {
            System.out.println("-------------Card-------------");
            System.out.println(user.getName());
            System.out.println(user.getBalance());
            System.out.println("Selamat Datang di " + store.getName());
            store.displayProducts();
            System.out.println("0. Keluar");
            System.out.print("> ");

            int input = scanner.nextInt();
            if(input == 0) {
                System.out.println("Terima kasih telah menggunakan layanan kami");
                break;
            } else if(input < 0 || input > store.getProducts().size()) {
                System.out.println("Input tidak valid");
                continue;
            } else if (input == 0) {
                break;
            } // perbaiki kondisi kalau user memasukkan selain nomor yang produk

            Product selectedProduct = store.getProducts().get(input - 1);
            System.out.println("Apakah anda yakin ingin membeli: ");
            System.out.println(selectedProduct.getName() + ", dengan Harga " + selectedProduct.getPrice());
            System.out.println("1. Konfirmasi");
            System.out.println("2. Batal");
            System.out.print("> ");

            int confirmationInput = scanner.nextInt();
            if(confirmationInput == 1) {
                if (selectedProduct.getStock() <= 0) {
                    System.out.println("Maaf, produk ini sudah habis.");
                    continue;
                }

                if(user.getBalance() < selectedProduct.getPriceValue()) {
                    System.out.println("Maaf, saldo anda tidak cukup untuk membeli produk ini. ");
                    continue;
                }

                user.debit(selectedProduct.getPriceValue());
                selectedProduct.sell();

                System.out.println(user.getName() + " berhasil membeli " + selectedProduct.getName());
            } else if (confirmationInput == 2) {
                System.out.println("Transaksi dibatalkan");
                continue;
            } else {
                System.out.println("Inputan tidak valid");
                continue;
            }
//perbaiki kondisi dimana user memasukkan input selain 1 & 2
            System.out.println("Lanjutkan transaksi?");
            System.out.println("1. Iya");
            System.out.println("2. Tidak");
            System.out.print("> ");

            int continueInput = scanner.nextInt();
            if(continueInput == 2) {
                break;
            } else if(continueInput != 1) {
                System.out.println("inputan tidak valid");
            }
        }

        scanner.close();
    }
}
