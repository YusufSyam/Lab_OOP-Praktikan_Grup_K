import java.time.chrono.MinguoChronology;
import java.util.Scanner;

public class no7 {
    public static void main(String[] args) {
        String[] pemain = {"Cristiano Ronaldo", "Luka Modric", "Karim Benzema" , "David Alaba", "Vinivius Junior"};
        // kumpulan nama pemain sepakbola
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama Sepakbola Terbaik : ");
        // membuat inputan
        String cari = input.nextLine();
        input.close();
        System.out.println(findIndex(pemain, cari));
    }
    public static int findIndex(String[] array, String teks) {
        for (int i = 0 ; i < array.length ; i++){
            if (array[i].equalsIgnoreCase(teks)){
                return i ;
            }
        }
        return -1;
    }
}
