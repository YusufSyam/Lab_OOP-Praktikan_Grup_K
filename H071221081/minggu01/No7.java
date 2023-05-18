
import java.util.Scanner;

public class No7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("cari kata : ");
        String cari = sc.nextLine();
        System.out.println("index = " + findIndex(cari));
        sc.close();
    }

    static int findIndex(String s) {
        String list[] = { "Burung", "Ayam", "Kucing", "Anjing", "Lebah", "Kecoa" };
        for (int i = 0; i < list.length; i++) {
            // * mencari nilai yang sama dengan mengabaikan case
            if (list[i].equalsIgnoreCase(s)) {
                return i+1;
            }
        }
        return -1;
    }
}
