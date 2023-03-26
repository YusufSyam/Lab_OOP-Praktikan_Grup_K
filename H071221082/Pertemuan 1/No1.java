import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("NIM  : ");
        String nim = inp.nextLine();
        int angka = Integer.parseInt(nim.substring(nim.length()-3));
        if (angka % 7 == 0) {
            System.out.println("Soal : no 7");

        } else {
            int nomor = angka % 7;
            System.out.println("Soal : no " + nomor);
        inp.close();
        }
    }
}