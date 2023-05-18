
import java.util.Scanner;
/**
 * No4
 */
public class No4 {

    public static void main(String[] args) {
        // * membuat objek Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan judul film : ");
        // * mendapatkan input dari user yang menerima value string
        String title = sc.nextLine();
        title(title);
        sc.close();
    }

    static void title(String s){
        String words[] = s.split(" ");
        for(int i = 0; i < words.length;i++){
            // * ambil karakter pertama lalu ubah ke kapital 
            // * mengambil atau slice string menggunakan method str.subtring()
            // * mengubah karakter ke kapital menggunakan method toUpperCase()
            // * lalu ubah value index dengan string baru yang telah disatukan  
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
            // System.out.println(words[i]);
        }
        // * join -> menggabungkan semua value dalam array ke dalam string dengan menggunakan delimeter sebagai pemisah
        String output = String.join(" ", words);
        System.out.println(output);
        // System.out.println(words);


    }
}