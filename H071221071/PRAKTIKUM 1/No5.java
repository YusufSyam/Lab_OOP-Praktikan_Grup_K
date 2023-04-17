import java.util.Scanner;

public class No5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String tanggal = input.nextLine();

        String[] arr_tanggal = tanggal.split("-");

        int[] arr_tanggal2 = new int[3];
        for (int i = 0; i < arr_tanggal.length; i++) {
            arr_tanggal2[i] = Integer.parseInt(arr_tanggal[i]);
        }
        int tahun = arr_tanggal2[2];
        String tahun2 = "";
        if (tahun >= 0 && tahun < 30) {
            tahun2 = "20" + arr_tanggal[2];

        } else {
            tahun2 = "19" + arr_tanggal[2];
        }
        System.out.println(arr_tanggal2[0] + " " + konversiBulan(arr_tanggal2[1]) + " " + tahun2);
        input.close();

    }

    public static String konversiBulan(int angka) {
        if (angka == 1) {
            return "Januari";
        } else if (angka == 2) {
            return "Febrruari";
        } else if (angka == 3) {
            return "Maret";
        } else if (angka == 4) {
            return "April";
        } else if (angka == 5) {
            return "Mei";
        } else if (angka == 6) {
            return "Juni";
        } else if (angka == 7) {
            return "Juli";
        } else if (angka == 8) {
            return "Agustus";
        } else if (angka == 9) {
            return "September";
        } else if (angka == 10) {
            return "Oktober";
        } else if (angka == 11) {
            return "November";
        } else if (angka == 12) {
            return "Desember";
        } else {
            return "";
        }
    }
    // System.out.println(arr_tanggal);

}
