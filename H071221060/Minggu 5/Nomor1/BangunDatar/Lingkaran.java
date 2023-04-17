package Nomor1.BangunDatar;

import java.util.Scanner;

public class Lingkaran extends BangunDatar {
    public Lingkaran(double jariJari){
    this.setJariJari(jariJari);
    }

    @Override
    double HitungLuas(){
        double luas = this.getPi() * this.getJariJari() * this.getJariJari();
        return luas;
    }

    @Override
    double HitungKeliling(){
        double diameter = this.getJariJari() * 2;
        double keliling = this.getPi() * diameter;
        return keliling;
    }

    public static void runLingkaran(){
        Scanner sc = new Scanner(System.in);
    
        System.out.println("=== LINGKARAN ===");
        System.out.println("Masukkan jari-jari");
        System.out.print("> ");
        int inpJariJari = sc.nextInt();
        sc.nextLine();
        Lingkaran lingkaran = new Lingkaran(inpJariJari);

        BangunDatar.reqHitung();
        int inpHitung = sc.nextInt();
        double result = 0;
        switch (inpHitung){
            case 1:
                result = lingkaran.HitungLuas();
                System.out.println("Luas lingkaran = " + result);
                break;
            case 2:
                result = lingkaran.HitungKeliling();
                System.out.println("Keliling lingkaran = " + result);
                break;
            default:
                break;
        }

        sc.close();
    }
}
