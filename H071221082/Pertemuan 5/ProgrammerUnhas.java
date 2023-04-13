class Anggota {
    String nama;
    int umur;
    int tinggiBadan;

    public Anggota(String nama,int umur, int tinggiBadan) {
        this.nama = nama;
        this.umur = umur;
        this.tinggiBadan = tinggiBadan;
    }

    public void infoAnggota() {
        System.out.println("\nNama         : " + nama);
        System.out.println("Umur         : " + umur + " tahun");
        System.out.println("Tinggi Badan : " + tinggiBadan + " cm");
    }
}

class PengurusInti extends Anggota {
    String periode;

    public PengurusInti(String nama, int umur, int tinggiBadan, String periode) {
        super(nama, umur, tinggiBadan);
        this.periode = periode;
    }

    public void infoPengurusInti() {
        super.infoAnggota();
        System.out.println("Periode      : " + periode);

    }
}

class KoordinatorBidang extends Anggota {
    String bidang;

    public KoordinatorBidang(String nama, int umur, int tinggiBadan, String bidang) {
        super(nama, umur, tinggiBadan);
        this.bidang = bidang;
    }

    public void infoKoordinatorBidang() {
        super.infoAnggota();
        System.out.println("Bidang       : " + bidang);

    }
}

class Staf extends Anggota {
    String divisi;

    public Staf(String nama, int umur, int tinggiBadan, String divisi) {
        super(nama, umur , tinggiBadan);
        this.divisi = divisi;
    }

    public void infoStaf() {
        super.infoAnggota();
        System.out.println("Divisi       : " + divisi);
    }
}

public class ProgrammerUnhas {
    public static void main(String[] args) {
        PengurusInti pengurus = new PengurusInti("Bambang", 20, 167, "2020" );
        KoordinatorBidang koordinator = new KoordinatorBidang("Jane", 21, 160, "Sosial");
        Staf staf = new Staf("Zul", 19, 163, "Back End");
    
        System.out.println("========== INFO ORGANISASI ==========");
        System.out.println("Pengurus     : " + pengurus.nama + " (Periode " + pengurus.periode + ")");
        System.out.println("Koordinator  : " + koordinator.nama + " (Bidang " + koordinator.bidang + ")");
        System.out.println("Staf         : " + staf.nama + " (Divisi " + staf.divisi + ")");

        pengurus.infoPengurusInti();
        koordinator.infoKoordinatorBidang();
        staf.infoStaf();
      }
}
