package ujian;


import java.util.Scanner;

import ujian.models.Mahasiswa;
import ujian.models.MataKuliah;
import ujian.models.NilaiKelas;
import ujian.models.NilaiPraktikum;
import ujian.utils.HelperMid;

public class Main {
    public static void main(String[] args) {
        /*
         * TODO 1
         * Instance Objek Mahasiswa
         * Pemberian nilai bisa dari constructor ataupun setter
         */
        Mahasiswa mahasiswa1 = new Mahasiswa("muh ikhsan", "H071191049");
        

        /*
         * TODO 2
         * Instance Objek MataKuliah
         * Pemberian nilai bisa dari constructor ataupun setter
         */
        MataKuliah oop = new MataKuliah("K001", "OOP", 2);

        /*
         * TODO 3
         * Instance Objek NilaiPraktikum
         * Pemberian nilai bisa dari constructor ataupun setter
         */
        NilaiPraktikum nilaiPraktikumOop = new NilaiPraktikum(oop, 100, 100);

        /*
         * TODO 4
         * Instance Objek NilaiKelas
         * Pemberian nilai bisa dari constructor ataupun setter
         */
        NilaiKelas nilaiKelasOop = new NilaiKelas(oop, 100, 100);

        /*
         * TODO 5
         * Kirimkan objek mahasiswa, nilaiKelas dan nilaiPraktikum
         * ke method runApp
         */
        runApp(mahasiswa1,nilaiKelasOop,nilaiPraktikumOop);
    }

    private static void runApp(Mahasiswa mahasiswa, NilaiKelas nilaiKelas, NilaiPraktikum nilaiPraktikum) {
        /*
         * TODO 6
         * Tampilkan data mahasiwa dan matakuliah seperti contoh berikut :
         * Nilai Matkul - OOP
         * Ikhsan(H071191049)
         */
        System.out.println("Nilai Matkul - " + nilaiKelas.getMataKuliah().getNamaMatkul());
        System.out.println(mahasiswa.getNama()+ "(" + mahasiswa.getNim() + ")");

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Show Nilai Praktikum");
        System.out.println("2. Show Nilai Kelas");
        System.out.println("3. Show Feedback");
        System.out.print("> ");
        int inp = scanner.nextInt();
        switch (inp) {
            case 1:
                System.out.println("-".repeat(25));
                System.out.println("Nilai Praktikum");
                // TODO 7 : Tampilkan Detail Nilai Praktikum
                nilaiPraktikum.showDetail();
                break;
            case 2:
                System.out.println("-".repeat(25));
                System.out.println("Nilai Kelas");
                // TODO 8 : Tampilkan Detail Nilai Kelas
                nilaiKelas.showDetail();
                break;
            case 3:
                System.out.println("=".repeat(25));
                // TODO 9 : Tampilkan Data Diri (showMyData)
                HelperMid.showMyData();
                // TODO 10 : Tampilkan Kritik dan Saran
                HelperMid.showFeedbackLab();
                System.out.println("=".repeat(25));
                break;
            default:
                break;
        }
        scanner.close();

    };
}