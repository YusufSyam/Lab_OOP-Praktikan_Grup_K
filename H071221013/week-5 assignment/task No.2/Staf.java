public class Staf extends SistemInformasi{
    String jabatan;
    String divisi;
    String tugas;
}

class Management extends Staf{
    public Management(String nama, int umur, String gender) {
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;
        this.jabatan = "Kepala Staf Management";
        this.divisi = "Management";
        this.tugas = "Mengelola seluruh pegawai";
    }
    public void showManagement() {
        System.out.println("  " + "=".repeat(4) + " STAF " + "=".repeat(4) + "\n");
        System.out.println("=".repeat(1) + " " + this.jabatan + " " + "=".repeat(1));
        System.out.println("Nama\t: " + this.getNama());
        System.out.println("Umur\t: " + this.getUmur());
        System.out.println("Gender\t: " + this.getGender());
        System.out.println("Divisi\t: " + this.divisi);
        System.out.println("Tugas\t: " + this.tugas);  
    }
}

class Penasehat extends Staf{
    public Penasehat(String nama, int umur, String gender) {
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;
        this.jabatan = "Ketua";
        this.divisi = "Penasehat";
        this.tugas = "Memberi Petunjuk";
    }
    public void showPenasehat() {
        System.out.println("  " + "=".repeat(4) + " " + this.jabatan + " " + "=".repeat(4));
        System.out.println("Nama\t: " + this.getNama());
        System.out.println("Umur\t: " + this.getUmur());
        System.out.println("Gender\t: " + this.getGender());
        System.out.println("Divisi\t: " + this.divisi);
        System.out.println("Tugas\t: " + this.tugas);  
    }
}   

class Pelayanan extends Staf{
    public Pelayanan(String nama, int umur, String gender) {
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;
        this.jabatan = "Ketua";
        this.divisi = "Pelayanan";
        this.tugas = "Melayani dan mengelola data";
    }
    public void showPelayanan() {
        System.out.println("  " + "=".repeat(4) + " " + this.jabatan + " " + "=".repeat(4));
        System.out.println("Nama\t: " + this.getNama());
        System.out.println("Umur\t: " + this.getUmur());
        System.out.println("Gender\t: " + this.getGender());
        System.out.println("Divisi\t: " + this.divisi);
        System.out.println("Tugas\t: " + this.tugas);  
    }
}