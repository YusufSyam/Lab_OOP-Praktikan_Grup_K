package Nomor1.BangunRuang;

import java.util.Scanner;

public class Kubus extends BangunRuang {
    public Kubus(double sisi){
        this.setPanjang(getPanjang());
    }

    @Override
    double HitungLuasPermukaan(){
        double luas = 6 * (this.getPanjang() * this.getPanjang());
        return luas;
    }

    @Override
    double HitungVolume(){
        double volume = this.getPanjang() * this.getPanjang() * this.getPanjang();
        return volume;
    }

    public static void runKubus(){
        Scanner sc = new Scanner(System.in);

        System.out.println("=== KUBUS ===");
        System.out.println("Masukkan Sisi");
        System.out.print("> ");
        int inpSisi = sc.nextInt();
        sc.nextLine();
        Kubus kubus = new Kubus(inpSisi);

        BangunRuang.ReqHitung();
        int inpHitung = sc.nextInt();
        double result = 0;
        switch (inpHitung) {
            case 1:
                result = kubus.HitungLuasPermukaan();
                System.out.println("Luas permukaan Kubus = " + result);
                break;
            case 2:
                result = kubus.HitungVolume();
                System.out.println("Volume Kubus = " + result);
                break;
            default:
                break;
        }

        sc.close();
    }
}
