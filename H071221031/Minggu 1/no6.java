import java.util.Scanner;
public class no6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            double r;
            // jari-jari
            double luas ;
            double pi = 3.141592;
            // nilai konstanta

            System.out.println("Masukkan r : ");
            // input nilai jari-jari
            r = input.nextDouble();
            luas = pi*r*r ;
            // menghitung luas lingkaran

            System.out.println("Luas = " + luas);
            // menampilkan nilai luas lingkaran

        }    catch (Exception e ){
                System.out.println("Masukkan Angka");
            }
        
}
}
