class Ban {
    String jenis;
    double diameter;

    public Ban(String jenis, double diameter){
        this.jenis = jenis;
        this.diameter = diameter;
    } 

    // method getter untuk atribut jenis ban
    public String getJenis() {
        return jenis;
    }

    // method setter untuk atribut jenis ban
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    // method getter untuk atribut diameter ban
    public double getDiameter() {
        return diameter;
    }

    // method setter untuk atribut diameter ban
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}

public class Sepeda {
    // attribute roda, kecepatan, dan harga
    int roda;
    int kecepatan;
    double harga;
    Ban banDepan;
    Ban banBelakang;
    
    // constructor pertama dengan parameter roda, kecepatan, dan harga
    public Sepeda(int roda, int kecepatan, double harga, Ban banDepan, Ban banBelakang) {
        this.roda = roda;
        this.kecepatan = kecepatan;
        this.harga = harga;
        this.banDepan = banDepan;
        this.banBelakang = banBelakang;
    }
    
    // constructor kedua tanpa parameter
    public Sepeda() {
        this.roda = 2;
        this.kecepatan = 0;
        this.harga = 0.0;
        this.banDepan = null; //null tidak memiliki nilai
        this.banBelakang = null;
    }
    
    // method untuk menaikkan kecepatan sepeda sebanyak n km/jam(behavior)
    public void tambahKecepatan(int kecepatan) {
        this.kecepatan += kecepatan;
        System.out.println("Kecepatan sepeda sekarang: " + this.kecepatan + " km/jam");
    }
    
    // method untuk menampilkan informasi sepeda(behavior)
    public void info() {
        System.out.println("\n========== Spesifikasi ==========");
        System.out.println("Jumlah roda: " + this.roda);
        System.out.println("Kecepatan: " + this.kecepatan + " km/jam");
        System.out.println("Harga: Rp" + this.harga);
        System.out.println("Ban Depan: " + this.banDepan.getJenis() + " dengan diameter " + this.banDepan.getDiameter() + " inci");
        System.out.println("Ban Belakang: " + this.banBelakang.getJenis() + " dengan diameter " + this.banBelakang.getDiameter() + " inci");
    }
    
    // method getter untuk atribut roda
    public int getRoda() {
        return this.roda;
    }

    // method setter untuk atribut roda
    public void setRoda(int roda) {
        this.roda = roda;
    }

    // method getter untuk atribut kecepatan
    public int getKecepatan() {
        return this.kecepatan;
    }

    // method setter untuk atribut kecepatan
    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    // method getter untuk atribut harga
    public double getHarga() {
        return this.harga;
    }
    // method setter untuk atribut harga
    public void setHarga(double harga) {
        this.harga = harga;
    }

    // method getter untuk atribut banDepan
    public Ban getBanDepan() {
        return this.banDepan;
    }

    // method setter untuk atribut banDepan
    public void setBanDepan(Ban banDepan) {
        this.banDepan = banDepan;
    }

    // method getter untuk atribut banBelakang
    public Ban getBanBelakang() {
        return this.banBelakang;
    }

    // method setter untuk atribut banBelakang
    public void setBanBelakang(Ban banBelakang) {
        this.banBelakang = banBelakang;
    }

}