import java.util.Scanner;
public class Pertemuan1_no4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan Judul Film: ");
        String kalimat = inp.nextLine(); 
        String[] kata = kalimat.toLowerCase().split(" ");  
        String kalimatBaru = "";
        for (int i = 0; i < kata.length; i++) { 
            kalimatBaru += kata[i].substring(0, 1).toUpperCase() + kata[i].substring(1) + " ";
        }                                                              
        System.out.println("> " + kalimatBaru);
        inp.close();
    }
}
