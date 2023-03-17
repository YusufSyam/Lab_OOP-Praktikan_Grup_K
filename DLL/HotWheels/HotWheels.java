package DLL.HotWheels;
public class HotWheels {
  String nama;
  double kecepatan, cash;
  int jumlahMenang;

  public HotWheels() {
  }

  public HotWheels(String nama, double kecepatan, double cash) {
    this.nama = nama;
    this.kecepatan = kecepatan;
    this.cash = cash;
    this.jumlahMenang = 0;
  }

  public void tampilkanSpek() {
    System.out.println("\n========== Spesifikasi ==========");
    System.out.println("Nama          : " + this.getNama());
    System.out.println("Kecepatan     : " + this.getKecepatan());
    System.out.println("Jumlah Menang : " + this.getJumlahMenang());
    System.out.println("Cash : " + this.getCash());
  }

  public void upgrade(int budget) {
    if (budget > this.cash) {
      System.out.println("Tidak bisa upgrade, uang tidak cukup");
    } else {
      // Setiap rp. 50.000 kecepatan bertambah 1
      int tambahKecepatan = budget / 50000;
      
      this.setKecepatan(this.getKecepatan() + tambahKecepatan);
      this.setCash(this.getCash() - budget + (budget % 50000));

      System.out.printf("\nMenambahkan kecepatan dari %s sebesar %d..\n", this.getNama(), tambahKecepatan);
    }
  }

  public void balap(HotWheels lawan) {
    if (this.getKecepatan() > lawan.getKecepatan()) {
      this.setJumlahMenang(this.getJumlahMenang() + 1);
      this.setCash(this.getCash() + 40000);

      System.out.printf("\n%s Menang! Jumlah Kemenangan dari %s mencapai %d kemenangan..\n", this.getNama(), this.getNama(),
          this.getJumlahMenang());
    } else if (this.getKecepatan() == lawan.getKecepatan()) {
      System.out.printf("\n%s dengan %s sama-sama kuat! Pertandingan berakhir seri..\n", this.getNama(), lawan.getNama());
    } else {
      lawan.setJumlahMenang(lawan.getJumlahMenang() + 1);
      lawan.setCash(lawan.getCash() + 50000);

      System.out.printf("%s Menang! Jumlah Kemenangan dari %s mencapai %d kemenangan..", lawan.getNama(),
          lawan.getNama(), lawan.getJumlahMenang());
    }
  }

  public void setCash(double cash) {
    this.cash = cash;
  }

  public void setJumlahMenang(int jumlahMenang) {
    this.jumlahMenang = jumlahMenang;
  }

  public void setKecepatan(double kecepatan) {
    this.kecepatan = kecepatan;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public double getCash() {
    return cash;
  }

  public int getJumlahMenang() {
    return jumlahMenang;
  }

  public double getKecepatan() {
    return kecepatan;
  }

  public String getNama() {
    return nama;
  }

}
