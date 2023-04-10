class PointBlank{
    String nama;
    double skill;
    int point;
    int cash;
    int exp;
    int jumlahMenang;

public PointBlank(){

}

public PointBlank(String nama, double skill, int point, int cash){
    this.nama = nama;
    this.skill = skill;
    this.point = point;
    this.cash = cash;
}

public void tampilkanAkun(){
    System.out.println("\n========== Spesifikasi Akun ==========");
    System.out.println("Nama             : " + this.getNama());
    System.out.println("Skill            : " + this.getSkill());
    System.out.println("Point            : " + this.getPoint());
    System.out.println("Cash             : " + this.getCash());
    System.out.println("Exp              : " + this.getExp());
    System.out.println("Jumlah Menang    : " + this.getJumlahMenang());
}

public void beliSenjata(int harga){
    if(harga > this.cash){
        System.out.println("\nPembelian senjata gagal, Silahkan isi cash terlebih dahulu.");
        this.skill += 0;

    } else{
        System.out.printf("\nPembelian senjata berhasil. Skill %s bertambah sebanyak 10\n", this.getNama());
        this.skill += 10;
        this.setCash(this.getCash() - harga);
    }

}

public void ambilTitle(int harga){
    if(harga > this.point){
        System.out.println("Point tidak cukup, pembelian title gagal.");

    } else {
        System.out.printf("\nPengambilan title berhasil. Skill %s bertambah sebanyak 10\n", this.getNama());
        this.skill += 10;
        this.setPoint(this.getPoint() - harga);
    }
}

public void war(PointBlank lawan){
    if(this.getSkill() > lawan.getSkill()){
        this.setJumlahMenang(this.getJumlahMenang() + 1);
        this.setPoint(this.getPoint() + 100);
        this.setCash(this.getCash() + 10);
        this.setExp(this.getExp() + 20);
        System.out.printf("\n%s Menang! Jumlah kemenangan dari %s mencapai %d \n", this.getNama() , this.getNama(), this.getJumlahMenang());
    
    } else if (this.getSkill() < lawan.getSkill()){
        lawan.setJumlahMenang(lawan.getJumlahMenang() + 1);
        lawan.setPoint(lawan.getPoint() + 100);
        lawan.setCash(lawan.getCash() + 10);
        lawan.setExp(lawan.getExp() + 20);
        System.out.printf("\n%s Menang! Jumlah kemenangan dari %s mencapai %d \n", lawan.getNama() , lawan.getNama(), lawan.getJumlahMenang());
    }
}  

public void setNama(String nama) {
    this.nama = nama;
}

public void setSkill(double skill) {
    this.skill = skill;
}

public void setPoint(int point) {
    this.point = point;
}

public void setCash(int cash) {
    this.cash = cash;
}

public void setExp(int exp){
    this.exp = exp;
}

public void setJumlahMenang(int jumlahMenang) {
    this.jumlahMenang = jumlahMenang;
}

public String getNama() {
    return nama;
}

public double getSkill() {
    return skill;
}

public int getPoint() {
    return point;
}

public int getCash() {
    return cash;
}

public int getExp(){
    return exp;
}

public int getJumlahMenang() {
    return jumlahMenang;
}
}