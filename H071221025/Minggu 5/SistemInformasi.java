public class SistemInformasi {
    private String nama;
    private int umur;
    private String jabatan;
    
    // Constructor
    public SistemInformasi(String nama, int umur, String jabatan) {
        this.nama = nama;
        this.umur = umur;
        this.jabatan = jabatan;
    }
    
    // Getter dan setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}


class KoordinatorBidang extends SistemInformasi {
    private String bidang;
    
    // Constructor
    public KoordinatorBidang(String nama, int umur, String jabatan, String bidang) {
        super(nama, umur, jabatan);
        this.bidang = bidang;
    }
    
    // Getter dan setter
    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public void menjalankanTugas(){
        System.out.println("Silahkan mengerjakan tugasnya masing-masing..");
    }

} 

class PengurusInti extends SistemInformasi {
    private String posisi;
    
    // Constructor
    public PengurusInti(String nama, int umur, String jabatan, String posisi) {
        super(nama, umur, jabatan);
        this.posisi = posisi;
    }
    
    // Getter dan setter
    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public void menjalankanTugas(){
        System.out.printf("saya %s sebagai %s akan memantau kegiatan saat berlangsung\n", super.getNama(), super.getJabatan());
    }
}


class Staf extends SistemInformasi {
    private String tugas;
    
    // Constructor
    public Staf(String nama, int umur, String jabatan, String tugas) {
        super(nama, umur, jabatan);
        this.tugas = tugas;
    }
    
    // Getter dan setter
    public String getTugas() {
        return tugas;
    }

    public void setTugas(String tugas) {
        this.tugas = tugas;
    }

    public void menjalankanTugas(){
        System.out.printf("%s sedang melaksanakan tugasnya\n", super.getNama());
    }
}