package Nomor1.BangunDatar;

import java.util.Scanner;

public class Trapesium extends BangunDatar {
    private double sisi3, sisi4;

    public double getSisi3() {
        return sisi3;
    }

    public void setSisi3(double sisi3) {
        this.sisi3 = sisi3;
    }

    public double getSisi4() {
        return sisi4;
    }

    public void setSisi4(double sisi4) {
        this.sisi4 = sisi4;
    }

    public Trapesium(double sisi1AB, double sisi2BC, double sisi3CD, double sisi4DA){
        this.setPanjang(sisi1AB);
        this.setLebar(sisi2BC);
        this.setSisi3(sisi3CD);
        this.setSisi4(sisi4DA);
    }

    @Override
    double HitungLuas(){
        double luas = (this.getPanjang() + this.getSisi3()) * this.getLebar() / 2;
        return luas;
    }

    @Override
    double HitungKeliling(){
        double keliling = this.getPanjang() + this.getLebar() + this.getSisi3() + this.getSisi4();
        return keliling;
    }

    public static void runTrapesium(){
        Scanner sc = new Scanner(System.in);

        System.out.println("=== TRAPESIUM ===");
        System.out.println("Masukkan sisi 1 (AB)");
        System.out.print("> ");
        int inpSisi1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Masukkan sisi 2 (BC)");
        System.out.print("> ");
        int inpSisi2 = sc.nextInt();
        sc.nextLine();

        System.out.println("Masukkan sisi 3 (CD)");
        System.out.print("> ");
        int inpSisi3 = sc.nextInt();
        sc.nextLine();

        System.out.println("Masukkan sisi 4 (DA)");
        System.out.print("> ");
        int inpSisi4 = sc.nextInt();
        sc.nextLine();

        Trapesium trapesium = new Trapesium(inpSisi1, inpSisi2, inpSisi3, inpSisi4);

        BangunDatar.reqHitung();
        int inpHitung = sc.nextInt();
        double result = 0;
        switch (inpHitung){
            case 1:
                result = trapesium.HitungLuas();
                System.out.println("Luas trapesium = " + result);
                break;
            case 2:
                result = trapesium.HitungKeliling();
                System.out.println("Keliling trapesium = " + result);
                break;
            default:
                break;
        }

        sc.close();
    }
}
