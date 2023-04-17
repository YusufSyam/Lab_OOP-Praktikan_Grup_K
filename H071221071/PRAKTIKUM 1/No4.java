import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = inp.nextLine(); // kucing
        String[] kata = kalimat.toLowerCase().split(" ");
        String kalimatBaru = "";
        for (int i = 0; i < kata.length; i++) {
            kalimatBaru += kata[i].substring(0, 1).toUpperCase() + kata[i].substring(1) + "";
        } // akan mengembalikan karakter pertama dari setiap kata yang telah dipecahkan
          // dan disimpan dalam array kata.
        System.out.println(kalimatBaru);
        inp.close();
    }
}
