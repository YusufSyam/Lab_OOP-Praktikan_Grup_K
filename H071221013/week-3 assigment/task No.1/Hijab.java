class Hijab {
    String merk;
    String kain;
    int pembelian;
    double harga;

    public Hijab(){
    }
    public Hijab(String merk, String kain, int pembelian, double harga){
        this.merk = merk;
        this.kain = kain;
        this.pembelian = pembelian;
        this.harga = harga;
    }
    public Hijab(String merk, String kain, double harga){
            this.merk = merk;
            this.kain = kain;
            this.pembelian = 4;
            this.harga = harga;
        }

    public void setmerk(String merk){
        this.merk = merk;
    }
    public String getmerk(){
        return merk;
    }
    public void setkain(String kain){
        this.kain = kain;
    }
    public String getkain(){
        return kain;
    }
    public void setpembelian(int pembelian) {
        this.pembelian = pembelian;
    }
    public int getpembelian() {
        return pembelian;
    }
    public void setharga(double harga){
        this.harga = harga;
    }
    public void detailHijab(){
        System.out.println("                Butik Santi             ");
        System.out.println("Merk Hijab                  : " + merk);
        System.out.println("Jenis Kain Yang di Gunakan  : " + kain);
        System.out.println("Pembelian Hijab             : " + pembelian);
        System.out.println("Harga Hijab                 : " + harga);
    }
    public double HargaHijab(){
        return pembelian * harga;
    }
}