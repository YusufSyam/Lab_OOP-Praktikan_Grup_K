import java.util.Scanner;

public class Main {

    //Buatlah kode untuk menghitung luas lingkaran, dengan output 2 angka dibelakang koma! (Jangan lupa tambahkan try catch untuk input bukan angka)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan jari-jari lingkaran: ");
            double r = input.nextDouble();
            double luas = Math.PI * Math.pow(r, 2);
            System.out.printf("Luas lingkaran adalah: %.2f", luas);
        } catch (Exception e) {
            System.out.println("Input bukan angka. Mohon masukkan angka.");
        }
    }
}