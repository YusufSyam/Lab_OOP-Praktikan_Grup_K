
public class main2 {
    public static void main(String[] args) {
        PengurusInti ilham = new PengurusInti("ilham","ketua");
        KoordinatorBidang nito = new KoordinatorBidang("nito","game development");
        Staf nit = new Staf("nit","game");
        ilham.info();
        nito.info();
        nit.info();
    }
}

class Anggota{
    protected String nama,jabatan;

    public Anggota(String nama,String jabatan){
        this.nama = nama;
        this.jabatan = jabatan;
    }

    void info(){
        System.out.println("nama " + nama + "\njabatan " + jabatan);
        System.out.println("====================");
    }
}

class PengurusInti extends Anggota {
    private String peran;
    public PengurusInti(String nama,String peran){
        super(nama, "Pengurus Inti");
        this.peran = peran;
    }

    @Override
    void info(){
        System.out.println("nama " + nama + "\njabatan " + jabatan + "\nkeanggotaan "+ peran);
        System.out.println("====================");
    }
}

class KoordinatorBidang extends Anggota {
    private String bidang;
    public KoordinatorBidang(String nama,String bidang){
        super(nama, "Koordinator bidang");
        this.bidang = bidang;
    }
    
    @Override
    void info(){
        System.out.println("nama " + nama + "\njabatan " + jabatan + "\nbidang "+ bidang);
        System.out.println("====================");
    }
}

class Staf extends Anggota {
    private String devisi;

    public Staf(String nama,String devisi){
        super(nama, "staf");
        this.devisi = devisi;
    }

    @Override
    void info(){
        System.out.println("nama " + nama + "\njabatan " + jabatan + "\ndevisi "+ devisi);
        System.out.println("====================");
    }
}


