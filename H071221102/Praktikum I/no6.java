import java.util.Scanner;

public class no6 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner (System.in); 
            // untuk menginput 
            double r ;
            double luas;
            //  menggunakan double, karena memiliki 2 angka dibelakang koma atau lebih
            final double phi = 3.14;
            System.out.print(("Input jari-jari = ")); 
            r = sc.nextDouble();
            luas = phi * r * r;

            String hasil = String.format("%.2f", luas);
            System.out.println("Hasil = "+ hasil);

            sc.close();
        } catch (Exception e) {
            System.out.println("Inputan harus angka");
        }
    }
}
