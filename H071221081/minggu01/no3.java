
import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        String nama,hobi,umur;
        // * membuat objek Scanner agar dapat membuat input
        Scanner sc = new Scanner(System.in);
        System.out.print("Name\t:");
        // * mendapatkan input dari user yang menerima value string
        nama = sc.nextLine();
        System.out.print("Age\t:");
        umur = sc.nextLine();
        System.out.print("Hobby\t:");
        hobi = sc.nextLine();
        sc.close();
        System.out.println("Nama saya " + nama +", " + umur + " tahun, hobby " + hobi);

    }
}
