class Koordinator extends SistemInformasi{
    String jabatan;
    String divisi;
    String tugas;
}

class HubunganMasyarakat extends Koordinator{
    public HubunganMasyarakat(String nama, int umur, String gender) {
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;
        this.jabatan = "Ketua Humas";
        this.divisi = "Hubungan Masyarakat";
        this.tugas = "Mengevaluasi sikap dan opini publik";
    }
    public void showHubunganMasyarakat() {
        System.out.println("=".repeat(5) + " KOORDINATOR BIDANG " + "=".repeat(5) + "\n");
        System.out.println("   " + "=".repeat(5) + " " + this.jabatan + " " + "=".repeat(5));
        System.out.println("Nama\t: " + this.getNama());
        System.out.println("Umur\t: " + this.getUmur());
        System.out.println("Gender\t: " + this.getGender());
        System.out.println("Divisi\t: " + this.divisi);
        System.out.println("Tugas\t: " + this.tugas);
    }
}

class Sarpras extends Koordinator{
    public Sarpras(String nama, int umur, String gender) {
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;
        this.jabatan = "Kepala Bidang Sarpras";
        this.divisi = "Sarana dan Prasarana";
        this.tugas = "Menyusun kebutuhan sarana dan prasarana";
    }
    public void showSarpras() {
        System.out.println(" " + "=".repeat(2) + " " + this.jabatan + " " + "=".repeat(2));
        System.out.println("Nama\t: " + this.getNama());
        System.out.println("Umur\t: " + this.getUmur());
        System.out.println("Gender\t: " + this.getGender());
        System.out.println("Divisi\t: " + this.divisi);
        System.out.println("Tugas\t: " + this.tugas);
    }
}

class Kesekretariatan extends Koordinator {
    public Kesekretariatan(String nama, int umur, String gender) {
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;
        this.jabatan = "Kepala Bidang Kesekretariatan";
        this.divisi = "Kesekretariatan";
        this.tugas = "Bertanggung jawab atas pengarsipan dan surat menyurat";
    }
    public void showKesekretariatan() {
        System.out.println("=".repeat(1) + " " + this.jabatan + " " + "=".repeat(1));
        System.out.println("Nama\t: " + this.getNama());
        System.out.println("Umur\t: " + this.getUmur());
        System.out.println("Gender\t: " + this.getGender());
        System.out.println("Divisi\t: " + this.divisi);
        System.out.println("Tugas\t: " + this.tugas + "\n");
    }
}