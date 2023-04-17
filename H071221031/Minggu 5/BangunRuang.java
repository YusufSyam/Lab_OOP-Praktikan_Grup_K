public class BangunRuang {
    private double luasPermukaan;
    private double volume;

    public double getLuasPermukaan() {
        return luasPermukaan;
    }
    public void setLuasPermukaan(double luasPermukaan) {
        this.luasPermukaan = luasPermukaan;
    }
    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }
}

class Kubus extends BangunRuang{
    private double sisi;

    public Kubus(double sisi){
        this.sisi = sisi;
    }
    public double luasPermukaan(){
        return 6 * sisi * sisi;
    }
    public double volume(){
        return sisi * sisi * sisi;
    }

}

class Balok extends BangunRuang{
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok (double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi ;
    }

    public double luasPermukaan(){
        return 2 * panjang * lebar + panjang * tinggi + lebar * tinggi;
    }

    public double volume(){
        return panjang * lebar * tinggi;
    }
}

class Bola extends BangunRuang{
    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;

    }
    public double luasPermukaan() {
        return 4 * Math.PI * jariJari * jariJari;
    }

    public double volume() {
        return 4 * Math.PI * jariJari * jariJari * jariJari / 3;
    }
}

class Tabung extends BangunRuang{
    private double jariJari;
    private double tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public double luasPermukaan() {
        return 2 * Math.PI * jariJari * (jariJari + tinggi);
    }

    public double volume() {
        return Math.PI * jariJari * jariJari * tinggi;
    }
}
