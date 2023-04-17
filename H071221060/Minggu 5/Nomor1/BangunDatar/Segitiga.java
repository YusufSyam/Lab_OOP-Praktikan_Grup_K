package Nomor1.BangunDatar;

import java.util.Scanner;

public class Segitiga extends BangunDatar {
    public Segitiga(double alas, double tinggi){
        this.setAlas(alas);
        this.setTinggi(tinggi);
    }

    @Override
    double HitungLuas(){
        double luas = this.getAlas() * this.getTinggi() / 2;
        return luas;
    }

    @Override
    double HitungKeliling(){
        double keliling = this.getPanjang() + this.getLebar() + this.getTinggi();
        return keliling;
    }

    public static void runSegitiga(){
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SEGITIGA ===");
        System.out.println("Masukkan alas");
        System.out.print("> ");
        int inpAlas = sc.nextInt();
        sc.nextLine();

        System.out.println("Masukkan tinggi");
        System.out.print("> ");
        int inpTinggi = sc.nextInt();
        sc.nextLine();

        Segitiga segitiga = new Segitiga(inpAlas, inpTinggi);

        BangunDatar.reqHitung();
        int inpHitung = sc.nextInt();
        double result = 0;
        switch (inpHitung){
            case 1:
                result = segitiga.HitungLuas();
                System.out.println("Luas segitiga = " + result);
                break;
            case 2:
                result = segitiga.HitungKeliling();
                System.out.println("Keliling segitiga = " + result);
                break;
            default:
                break;
        }

        sc.close();
    }
}
