package Nomor1;

import java.util.Scanner;

import Nomor1.BangunDatar.Lingkaran;
import Nomor1.BangunDatar.Persegi;
import Nomor1.BangunDatar.PersegiPanjang;
import Nomor1.BangunDatar.Segitiga;
import Nomor1.BangunDatar.Trapesium;
import Nomor1.BangunRuang.Balok;
import Nomor1.BangunRuang.Bola;
import Nomor1.BangunRuang.Kubus;
import Nomor1.BangunRuang.Tabung;

public class Main {
    public static void main(String[] args) {
     runApp();   
    }

    static void runApp(){
        Scanner sc = new Scanner(System.in);
        System.out.println("===== BANGUN RUANG =====");
        System.out.println("1. KUBUS \n2. BALOK \n3. BOLA \n4. TABUNG");
        System.out.println("");

        System.out.println("===== BANGUN DATAR =====");
        System.out.println("1. PERSEGI \n2. PERSEGI PANJANG \n3. LINGKARAN \n4. SEGITIGA \n5. TRAPESIUM");
        System.out.println("");

        System.out.println("=".repeat(20));
        System.out.println("===== TIPE BANGUN RUANGAN =====");
        System.out.println("1. Bangun Ruang \n2. Bangun Datar");
        System.out.println("Pilih tipe bangunan");
        System.out.print("> ");
        int inpTipe = sc.nextInt();
        sc.nextLine();
        switch (inpTipe){
            case 1:
                runBangunRuang();
                break;
            case 2:
                runBangunDatar();
                break;
            default:
                System.out.println("Maaf, input data dengan benar");
                runApp();
                break;
        }

        sc.close();
    }

    static void runBangunRuang(){
        Scanner sc = new Scanner(System.in);

        System.out.println("=".repeat(20));
        System.out.print("Pilih bangunan (nomor) \n> ");
        int inpBangunan = sc.nextInt();
        switch (inpBangunan){
            case 1:
                Kubus.runKubus();
                break;
            case 2:
                Balok.runBalok();
                break;
            case 3:
                Bola.runBola();
                break;
            case 4:
                Tabung.runTabung();
                break;
            default:
                break;
        }

        sc.close();
    }

    static void runBangunDatar(){
        Scanner sc = new Scanner(System.in);

        System.out.println("=".repeat(20));
        System.out.print("Pilih bangunan (nomor) \n> ");
        int inpBangunan = sc.nextInt();
        switch(inpBangunan){
            case 1:
                Persegi.runPersegi();
                break;
            case 2:
                PersegiPanjang.runPersegiPanjang();
                break;
            case 3:
                Lingkaran.runLingkaran();
                break;
            case 4:
                Segitiga.runSegitiga();
                break;
            case 5:
                Trapesium.runTrapesium();
                break;
            default:
                break;
        }

        sc.close();
    }
}
