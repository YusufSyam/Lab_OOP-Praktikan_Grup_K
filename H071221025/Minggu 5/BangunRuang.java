public class BangunRuang {
    double luasPermukaan;
    double volume;
}


class Kubus extends BangunRuang {
    private double sisi;
    
    public Kubus(double sisi) {
        this.sisi = sisi;
    }
    
    public double volume() {
        return sisi * sisi * sisi;
    }
    
    public double luasPermukaan() {
        return 6 * sisi * sisi;
    }
}

class Balok extends BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;   
    }

    public double volume() {
        return panjang * lebar * tinggi;
    }

    public double luasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}

class Bola extends BangunRuang{
    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    public double volume(){
        return 4/3 * Math.PI * Math.pow(jariJari, 3);
    }

    public double luasPermukaan(){
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }
}

class Tabung extends BangunRuang {
    private double jariJari;
    private double tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public double volume() {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    public double luasPermukaan() {
        return 2 * Math.PI * jariJari * (jariJari + tinggi);
    }
}