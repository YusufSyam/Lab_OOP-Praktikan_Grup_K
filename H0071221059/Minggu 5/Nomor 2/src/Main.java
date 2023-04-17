class komunitasProgrammerUnhas {
    String nama;
    String jenisKelamin;
    String jabatan;

    public komunitasProgrammerUnhas(String nama, String jenisKelamin, String jabatan) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.jabatan = jabatan;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Jabatan: " + jabatan);
    }
}

class PengurusInti extends komunitasProgrammerUnhas {
    String divisi;

    public PengurusInti(String nama, String jenisKelamin, String jabatan, String divisi) {
        super(nama, jenisKelamin, jabatan);
        this.divisi = divisi;
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Divisi: " + divisi);
    }
}

class KoordinatorBidang extends komunitasProgrammerUnhas {
    String bidang;

    public KoordinatorBidang(String nama, String jenisKelamin, String jabatan, String bidang) {
        super(nama, jenisKelamin, jabatan);
        this.bidang = bidang;
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Bidang: " + bidang);
    }
}

class Staf extends komunitasProgrammerUnhas {
    String tugas;

    public Staf(String nama, String jenisKelamin, String jabatan, String tugas) {
        super(nama, jenisKelamin, jabatan);
        this.tugas = tugas;
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tugas: " + tugas);
    }
}

public class Main {
    public static void main(String[] args) {
        PengurusInti pi = new PengurusInti("Zul", "Laki-laki", "Ketua Umum", "Keuangan");
        KoordinatorBidang kb = new KoordinatorBidang("Erqi", "Perempuan", "Ketua Bidang", "Pengembangan Teknologi");
        Staf st = new Staf("Fiq", "Laki-laki", "Staf", "Administrasi");

        pi.tampilkanInfo();
        System.out.println();
        kb.tampilkanInfo();
        System.out.println();
        st.tampilkanInfo();
    }
}