import java.util.Scanner;
public class Pertemuan1_no7 {
    public static void main(String[] args) {
        String [] praktikan = {"Ichan", "Yusuf", "Richard", "Alif", "Fatwa", "Ikhsan"};
        Scanner inp = new Scanner(System.in);
        System.out.println("Masukkan nama praktikan yang dicari : ");
        String cari = inp.nextLine();
        inp.close();

        System.out.println(findIndex(praktikan, cari));
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