public class Running{
    // atribut

    String nama;
    int usia;
    Kecepatan kecepatan;

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getUsia() {
        return usia;
    }
    public void setUsia(int usia) {
        this.usia = usia;
    }

    // cunstructor 1
    public Running(String nama, int usia, Kecepatan kecepatan){
        this.nama = nama;
        this.usia = usia;
        this.kecepatan = kecepatan;
    }
    // cunstructor 2
    public Running(String nama, int usia){
        this.nama = nama;
        this.usia = usia;
        this.kecepatan = new Kecepatan();
    }
    
    // behavior
    public void Info(){
        System.out.println("Lari dengan kecepatan " + this.kecepatan.getKecepatan() + "km/jam");
    }

    public void setKecepatan(int kecepatan){
        this.kecepatan.setKecepatan(kecepatan);
    }
}

class Kecepatan{
    int kecepatan;

    public void setKecepatan(int kecepatan){
        this.kecepatan = kecepatan;
    }

    public int getKecepatan(){
        return this.kecepatan;
    }
}