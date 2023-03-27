import java.util.Scanner;

public class No6 {
    public static void main(String[] args) {
        try{
            Scanner inp = new Scanner(System.in);
            double jariJari;
            double luas;
            final double pi = 3.1415;
            System.out.print("Nilai jari-jari : ");
            jariJari = inp.nextDouble();
            luas = pi * jariJari * jariJari;

            String hasil = String.format("%.2f", luas);
            System.out.println(hasil);
            inp.close();
            
        } catch (Exception e) {
            System.out.println("Inputan hanya terdiri dari angka");
        }
    }
}
