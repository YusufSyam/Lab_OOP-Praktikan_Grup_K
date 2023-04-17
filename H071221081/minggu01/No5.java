
import java.util.HashMap;
import java.util.Scanner;

public class No5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        convert(input);
        sc.close();
    }


    static void convert(String s){
        int tbt[] = new int[3];
        
        String lst[] = s.split("-");

        for (int i = 0; i < lst.length; i++) {
            tbt[i] = Integer.parseInt(lst[i]);
        }
        // System.out.println(String.join(" ", tbt));

        String tahun;
        String tanggal = String.format("%02d",tbt[0]);
        // System.out.println(tanggal);
        String bulan = getMonth(tbt[1]);
        // System.out.println(bulan);
        if (tbt[2] >= 0 && tbt[2] < 30){
            tahun = "20" + String.format("%02d",tbt[2]);
        }else{
            tahun = "19" + tbt[2];
        }

        System.err.println(tanggal + " " + bulan + " " + tahun);
    }
    static String getMonth(int s){
        // ! saoerad
        // TODO asdasdass
        // * membuat membaut HashMap untuk memudahkan mencari nama bulan berdasarkan angka
        HashMap<Integer, String> months = new HashMap<>();
        months.put(1, "Januari");
        months.put(2, "Februari");
        months.put(3, "Maret");
        months.put(4, "April");
        months.put(5, "Mei");
        months.put(6, "Juni");
        months.put(7, "Juli");
        months.put(8, "Agustus");
        months.put(9, "September");
        months.put(10, "Oktober");
        months.put(11, "November");
        months.put(12, "Desember");

        // * memanggil value menggunakan key 
        return months.get(s);
    }
}
