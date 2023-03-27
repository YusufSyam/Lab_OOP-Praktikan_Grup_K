import java.util.*;

public class Main {
    //Buatlah method yang dapat digunakan untuk menkonversi string seperti berikut ini
//Input :
//“01-04-03”
//Output :
//1 April 2003
//Input :
//“02-01-98”
//Output:
//2 Januari
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tanggal (format: DD-MM-YY): ");
        String tanggal = input.nextLine();
        String tanggalKonversi = konversiTanggal(tanggal);
        System.out.println("Tanggal dalam format baru " + tanggalKonversi);
    }
    public static String konversiTanggal(String tanggal){
        String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli","Agustus", "September", "Oktober", "November", "Desember"};
        String[] tanggalArr = tanggal.split("-");
        int day = Integer.parseInt(tanggalArr[0]);
        String month = bulan[Integer.parseInt(tanggalArr[1])-1];
        int year = Integer.parseInt("20"+tanggalArr[2]) >= 2021 ? Integer.parseInt("19" +tanggalArr[2]) : Integer.parseInt("20"+tanggalArr[2]);
        return day + " " + month + " " + year;
    }
}