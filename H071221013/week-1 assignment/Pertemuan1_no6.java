import java.util.Scanner;
public class Pertemuan1_no6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
        double r, L;
        final double phi=3.14;  
        System.out.println("Mencari Luas Lingkaran");
        System.out.println("Masukkan Jari-jari: ");
        r = input.nextDouble();
        L = phi * r * r;
        System.out.printf("Luas Lingkaran = %.2f", L);
        } catch (Exception e) {
          System.out.println("Input bukan angka");
      }
        input.close();
    }
}