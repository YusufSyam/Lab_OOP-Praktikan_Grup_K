package Nomor1.BangunRuang;

import java.util.Scanner;

public class Bola extends BangunRuang {
    public Bola(double jariJari){
        this.setJariJari(jariJari);
    }

    @Override
    double HitungLuasPermukaan(){
        double luas = 4 * this.getPi() * (this.getJariJari() * this.getJariJari());
        return luas;
    }

    @Override
    double HitungVolume(){
        double volume = (4/3) * this.getPi() * (this.getJariJari() * this.getJariJari() * this.getJariJari());
        return volume;
    }

    public static void runBola(){
        Scanner sc = new Scanner(System.in);

        System.out.println("=== BOLA ===");
        System.out.println("Masukkan jari-jari");
        System.out.print("> ");
        int inpJariJari = sc.nextInt();
        sc.nextLine();
        Bola bola = new Bola(inpJariJari);

        BangunRuang.ReqHitung();
        int inpHitung = sc.nextInt();
        double result = 0;
        switch (inpHitung){
            case 1:
                result = bola.HitungLuasPermukaan();
                System.out.println("Luas permukaan bola = " + result);
                break;
            case 2:
                result = bola.HitungVolume();
                System.out.println("Volume bola = " + result);
                break;
            default:
                break;
        }

        sc.close();

    }
}
