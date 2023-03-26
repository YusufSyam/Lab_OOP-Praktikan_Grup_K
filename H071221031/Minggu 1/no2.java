import java.util.Scanner ;
import java.util.InputMismatchException;
public class no2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        try{
        System.out.println("Masukkan  jumlah bilangan : ");
        int n = scanner.nextInt();
        // Buat inputan n

        int integerCount = 0;
        //Menghitung bilangan bulat

        int decimalCount = 0;
        // menghitung bilangan desimal

        for (int i = 1; i<= n; i++){
            System.out.println("Masukkan bilangan ke-" +i + ": ");
            double input = scanner.nextDouble();

            if ( input == (int) input){
                integerCount++;
            } else {
                decimalCount++;
            }
        }
        // mengecek bilangan bulat atau desimal

        System.out.println("Jumlah bilangan integer : " + integerCount);
        System.out.println("JUmlah bilangan desimal : " + decimalCount) ;
        // menampilkan hasil
        } catch (InputMismatchException e) {
            System.out.println("Hanya Angka ");
        }
    }
}
