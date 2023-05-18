class PengurusInti extends SistemInformasi{
    String jabatan;
    String tugas;
}

class KetuaUmum extends PengurusInti {
    public KetuaUmum(String nama, int umur, String gender) {
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;
        this.jabatan = "Ketua Umum";
        this.tugas = "Memimpin dan mengkoordinasi Organisasi";
    }

    public void showKetuaUmum() {
        System.out.println("=".repeat(5) + " PENGURUS INTI " + "=".repeat(5) + "\n");
        System.out.println(" =".repeat(3) + " " + this.jabatan + " " + "= ".repeat(3));
        System.out.println("Nama\t: " + this.getNama());
        System.out.println("Umur\t: " + this.getUmur());
        System.out.println("Gender\t: " + this.getGender());
        System.out.println("Tugas\t: " + this.tugas);
    }
}

class Sekretaris extends PengurusInti {
    public Sekretaris(String nama, int umur, String gender) {
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;
        this.jabatan = "Sekretaris";
        this.tugas = "Menyusun Rencana Kegiatan Kerja";
    }
    public void showSekretaris() {
        System.out.println(" " +" =".repeat(2) + " " + this.jabatan + " " +"= ".repeat(2));
        System.out.println("Nama\t: " + this.getNama());
        System.out.println("Umur\t: " + this.getUmur());
        System.out.println("Gender\t: " + this.getGender());
        System.out.println("Tugas\t: " + this.tugas);
    }
}

class Bendahara extends PengurusInti {
    public Bendahara(String nama, int umur, String gender){
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;
        this.jabatan = "Bendahara";
        this.tugas = "Mengatur Keuangan"; 
    }
    public void showBendahara() {
        System.out.println("    " + "=".repeat(1) + " " + this.jabatan + " " + "= ".repeat(1));
        System.out.println("Nama\t: " + this.getNama());
        System.out.println("Umur\t: " + this.getUmur());
        System.out.println("Gender\t: " + this.getGender());
        System.out.println("Tugas\t: " + this.tugas + "\n");
    }
}