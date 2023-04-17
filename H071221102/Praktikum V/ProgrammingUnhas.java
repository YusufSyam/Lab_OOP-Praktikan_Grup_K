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
        System.out.println("Nama    : " + nama);
        System.out.println("Umur    : " + umur);
        System.out.println("Tinggi Badan : " + tinggiBadan);
    }
}

class PengurusInti extends Anggota {
    String periode;

    public PengurusInti(String nama, int umur, int tinggiBadan, String periode) {
        super(nama, 20, 172);
        this.periode = periode;
    }

    public void infoAnggota() {
        super.infoAnggota();
        System.out.println("Periode : " + periode);
    }
}

class KoordinatorBidang extends Anggota {
    String bidang;

    public KoordinatorBidang(String nama, int umur, int tinggiBadan, String bidang) {
        super(nama, umur, tinggiBadan);
        this.bidang = bidang;
    }

    public void infoAnggota() {
        super.infoAnggota();
        System.out.println("Bidang  : " + bidang);
    }
}

class Staf extends Anggota {
    String divisi;

    public Staf(String nama, int umur, int tinggiBadan, String divisi) {
        super(nama, umur , tinggiBadan);
        this.divisi = divisi;
    }

    public void infoAnggota() {
        super.infoAnggota();
        System.out.println("Divisi   : " + divisi);
    }
}

public class ProgrammingUnhas {
    public static void main(String[] args) {
        PengurusInti pengurus = new PengurusInti("Adnan", 20, 172, "2024" );
        KoordinatorBidang koordinator = new KoordinatorBidang("Mayko", 21, 176, "Humas");
        Staf staf = new Staf("Fikry", 19, 170, "Frontend");
    
        System.out.println("Pengurus    : " + pengurus.nama + " ( Periode " + pengurus.periode + ")");
        System.out.println("Koordinator : " + koordinator.nama + " ( Bidang " + koordinator.bidang + ")");
        System.out.println("Staf        : " + staf.nama + " ( Divisi " + staf.divisi + ")");
      }
}
