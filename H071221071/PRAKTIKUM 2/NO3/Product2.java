import java.util.Scanner;

public class Product2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan ID produk: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Mengkonsumsi karakter newline (\n)

        System.out.print("Masukkan nama produk: ");
        String name = scanner.nextLine();

        System.out.print("Masukkan stok produk: ");
        int stock = scanner.nextInt();

        System.out.print("Masukkan harga produk: ");
        double price = scanner.nextDouble();

        Product product = new Product(id, name, stock, price);

        System.out.println("\nInformasi Produk:");
        System.out.println("ID Produk: " + product.getId());
        System.out.println("Nama Produk: " + product.getName());
        System.out.println("Stok Produk: " + product.getStock());
        System.out.println("Harga Produk: " + product.getPrice());

        if (product.CekStok()) {
            System.out.println("Produk tersedia");
        } else {
            System.out.println("Maaf stok produk tidak tersedia");
        }
        scanner.close();
    }
}
