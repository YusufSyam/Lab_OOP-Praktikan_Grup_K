package Nomor1.BangunDatar;

public class BangunDatar {
    final private double pi = 3.14;
    private double panjang, lebar, alas, tinggi, jariJari;

    
    double HitungLuas(){
        double luas = 0;
        return luas;
    }
    
    double HitungKeliling(){
        double keliling = 0;
        return keliling;
    }

    protected static void reqHitung(){
        System.out.println("=".repeat(20));
        System.out.println("1. Luas \n2. Keliling");
        System.out.println("Mau hitung apa?");
        System.out.print("> ");
    }

    protected double getPi(){
        return pi;
    }
    
    protected double getPanjang() {
        return panjang;
    }

    protected void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    protected double getLebar() {
        return lebar;
    }

    protected void setLebar(double lebar) {
        this.lebar = lebar;
    }

    protected double getAlas() {
        return alas;
    }

    protected void setAlas(double alas) {
        this.alas = alas;
    }

    protected double getTinggi() {
        return tinggi;
    }

    protected void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    protected double getJariJari() {
        return jariJari;
    }

    protected void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
    
}
