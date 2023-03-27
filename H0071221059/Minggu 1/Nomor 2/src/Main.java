import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int count_int = 0;
        int count_decimal = 0;
        try {
            System.out.print("Masukkan jumlah bilangan: ");
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print("Masukkan bilangan ke-" + (i+1) + ": ");
                double num = sc.nextDouble();
                if (num % 1 == 0) {
                    count_int++;
                } else {
                    count_decimal++;
                }
            }
            System.out.println(count_int + " Bilangan Bulat");
            System.out.println(count_decimal + " Bilangan Desimal");
        } catch (Exception e) {
            System.out.println("Input harus berupa angka!");
        }
    }
}