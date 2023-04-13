public class BangunDatar {
    private double keliling;
    private double luas;

    public double getKeliling() {
        return keliling;
    }
    public void setKeliling(double keliling) {
        this.keliling = keliling;
    }
    public double getLuas() {
        return luas;
    }
    public void setLuas(double luas) {
        this.luas = luas;
    }
}

class Persegi extends BangunDatar{
    private double sisi;

    public Persegi(double sisi){
        this.sisi = sisi;
    }

    public double keliling(){
        return sisi + sisi + sisi + sisi;
    }

    public double luas(){
        return sisi * sisi;
    }
}

class PersegiPanjang extends BangunDatar{
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double keliling(){
        return 2 * (panjang + lebar );
    }

    public double luas(){
        return panjang * lebar ;
    }
}

class Lingkaran extends BangunDatar{
    private double jariJari;

    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double keliling(){
        return 2 * Math.PI * jariJari;
    }

    public double luas(){
        return Math.PI * jariJari * jariJari;
    }
}

class Segitiga extends BangunDatar{
    private double alas;
    private double tinggi;
    private double sisi1;
    private double sisi2;
    private double sisi3;

    public Segitiga(double alas, double tinggi, double sisi1, double sisi2, double sisi3){
        this.alas = alas;
        this.tinggi = tinggi; 
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    public double keliling(){
        return sisi1 + sisi2 + sisi3;
    }

    public double luas(){
        return 0.5 * alas * tinggi;
    }
}

class Trapesium extends BangunDatar{
    private double tinggi;
    private double sisiSejajar1;
    private double sisiSejajar2;
    private double sisiSejajar3;
    private double sisiSejajar4;

    public Trapesium(double tinggi, double sisiSejajar1, double sisiSejajar2, double sisiSejajar3, double sisiSejajar4){
        this.tinggi = tinggi ;
        this.sisiSejajar1 = sisiSejajar1;
        this.sisiSejajar2 = sisiSejajar2;
        this.sisiSejajar3 = sisiSejajar3;
        this.sisiSejajar4 = sisiSejajar4;
    }

    public double keliling(){
        return sisiSejajar1 + sisiSejajar2 + sisiSejajar3 + sisiSejajar4;
    }

    public double luas(){
        return 0.5 * (sisiSejajar1 + sisiSejajar3) * tinggi;
    }
}

