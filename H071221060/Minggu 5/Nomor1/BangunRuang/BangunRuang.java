package Nomor1.BangunRuang;

public class BangunRuang {
    final private double pi = 3.14;
    private double panjang, lebar, alas, tinggi, jariJari;

    
    double HitungLuasPermukaan(){
        double luas = 0;
        return luas;
    }

    double HitungVolume(){
        double volume = 0;
        return volume;
    }

    protected static void ReqHitung(){
        System.out.println("=".repeat(20));
        System.out.println("1. Luas permukaan \n2. Volume");
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
