import java.util.Scanner;

public class Assigment1No7 {
    public static void main(String[] args) {
        String [] buah = {"Apple", "Rambutan", "Anggur", "Mangga", "Alpukat"};
        Scanner inp = new Scanner(System.in);
        System.out.println("Masukkan buah yang dicari : ");
        String cari = inp.nextLine();
        inp.close();

        System.out.println(findIndex(buah, cari));
    }
    public static int findIndex(String [] array, String teks) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(teks)) {
                return i;
            }
        }
        return -1;
    }
    
}
