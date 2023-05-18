package bangunRuang;

class BangunDatar {
    protected double luas;
    protected double keliling;

    public double getLuas() {
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public double getKeliling() {
        return keliling;
    }

    public void setKeliling(double keliling) {
        this.keliling = keliling;
    }
}

class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double luas() {
        return sisi * sisi;
    }

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

    public double luas() {
        return panjang * lebar;
    }

    public double keliling() {
        return 2 * (panjang + lebar);
    }
}

class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double luas() {
        return Math.PI * Math.pow(jariJari, 2);
    }

    public double keliling() {
        return 2 * Math.PI * jariJari;
    }
}

class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisi1;
    private double sisi2;
    private double sisi3;
    
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public Segitiga(double alas, double tinggi, double sisi1, double sisi2, double sisi3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    public double luas() {
        return 0.5 * alas * tinggi;
    }

    public double keliling() {
        return sisi1 + sisi2 + sisi3;
    }
}

class Trapesium extends BangunDatar {
    private double sisi1;
    private double sisi2;
    private double sisi3;
    private double sisi4;
    private double tinggi;

    public Trapesium(double sisi1, double sisi2, double sisi3, double sisi4,  double tinggi) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
        this.sisi4 = sisi4;
        this.tinggi = tinggi;
    }

    public double luas() {
        return 0.5 * (sisi1 + sisi2) * tinggi;
    }

    public double keliling() {
        return sisi1 + sisi2 + sisi3 + sisi4;
    }
}