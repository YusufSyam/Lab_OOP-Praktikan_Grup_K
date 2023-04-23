import java.util.Scanner;

public class Assigment1No6 {
   public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);

      try {
         System.out.print("Masukkan jari-jari lingkaran: ");
         double jariJari = inp.nextDouble();

         String luas = String.format("%.2f", (Math.PI * jariJari * jariJari));

         System.out.println("Luas lingkaran = " + luas);
      } catch (Exception e) {
         System.out.println("Input harus berupa angka!");
      }
      inp.close();
   }
}