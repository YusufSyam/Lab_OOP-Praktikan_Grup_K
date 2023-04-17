import java.util.Scanner;
public class no4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan kalimat : ");
        // membuat inputan kalimat
        String kalimat = input.nextLine();
        String[] kata = kalimat.toLowerCase().split(" ");
        String kalimatBaru = " ";

        for (int i = 0 ; i < kata.length; i++){
            kalimatBaru +=
kata[i].substring(0,1).toUpperCase() + kata [i].substring(1) + " ";
        }
        System.out.println("Kalimat Setelah diubah :" + kalimatBaru.trim());
        input.close();
    }
}
