public class SistemInformasi {
    private String nama;
    private int umur;
    private String jabatan;
    
    public SistemInformasi() {
    }

    public SistemInformasi(String nama, int umur, String jabatan) {
        this.nama = nama;
        this.umur = umur;
        this.jabatan = jabatan;
    }

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

    public void berbicara(){
        System.out.println(this.nama + " sedang berbicara...");
    }
    
}