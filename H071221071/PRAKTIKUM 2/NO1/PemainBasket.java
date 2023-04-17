public class PemainBasket {
    String nama;
    float tinggiBadan;
    String posisi;
    String tim;
    int nomorPunggung;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setTinggiBadan(float tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    }

    public float getTinggiBadan() {
        return tinggiBadan;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setTim(String tim) {
        this.tim = tim;
    }

    public String getTim() {
        return tim;
    }

    public void setNomorPunggung(int nomorPunggung) {
        this.nomorPunggung = nomorPunggung;
    }

    public int getNomorPunggung() {
        return nomorPunggung;
    }


    public void mencetak_info() {
        System.out.println("Info lengkap tentang " + nama + ":");
        System.out.println("Tinggi badan: " + tinggiBadan + " cm");
        System.out.println("Posisi: " + posisi);
        System.out.println("Tim: " + tim);
        System.out.println("Nomor punggung: " + nomorPunggung);
    }

}
