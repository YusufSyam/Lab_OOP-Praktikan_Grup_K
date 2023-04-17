import java.lang.Math;

class BangunDatar {
String jenis;


    public double luas() {
        return 0;
    }

    public double keliling() {
        return 0;
    }
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}

class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }

    @Override
    public double keliling() {
        return 4 * sisi;
    }
}

class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double luas() {
        return panjang * lebar;
    }

    @Override
    public double keliling() {
        return 2 * (panjang + lebar);
    }
}

class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double luas() {
        return Math.PI * Math.pow(jariJari, 2);
    }

    @Override
    public double keliling() {
        return 2 * Math.PI * jariJari;
    }
}

class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisiA;
    private double sisiB;
    private double sisiC;

    public Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    @Override
    public double luas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double keliling() {
        return sisiA + sisiB + sisiC;
    }
}

class Trapesium extends BangunDatar {
    private double sisiAtas;
    private double sisiBawah;
    private double tinggi;
    private double sisiKanan;
    private double sisiKiri;


    public Trapesium(double sisiAtas, double sisiBawah, double tinggi, double sisiKanan, double sisiKiri) {
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.tinggi = tinggi;
        this.sisiKanan = sisiKanan;
        this.sisiKiri = sisiKiri;
    }

    @Override
    public double luas() {
        return 0.5 * (sisiAtas + sisiBawah) * tinggi;
    }

    @Override
    public double keliling() {
        return sisiAtas + sisiBawah + sisiKanan + sisiKiri;
    }
}
