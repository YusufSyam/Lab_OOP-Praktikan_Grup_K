
import java.util.Scanner;

public class No6 {
    public static void main(String[] args) {
        // * untuk berjaga-jaga apabila inputan bukan merupakan angka 
        try {
            Scanner sc = new Scanner(System.in);
            double r = sc.nextDouble();
            double result = luas(r);

            // * untuk membatasi banyak nya angka yang akan muncul di belakang koma
            System.out.println(String.format("%.02f",result));
            sc.close();
        } catch (Exception e) {
            // * menampilkan pesan error
            System.out.println(e.getMessage());
        }
    }

    static double luas(double r){
        // * rumus mencari luas lingkaran
        // * menggunakan Math.PI untuk mendapatkan nilai di PI
        return Math.PI * r * r;
    }
}
