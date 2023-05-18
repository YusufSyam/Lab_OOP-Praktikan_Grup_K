
import java.util.Scanner;

class BangunRuang {
    double volume() {
        return 0;
    }

    double luasPermukaan() {
        return 0;
    }
}

class BangunDatar {
    double luas() {
        return 0;
    }

    double keliling() {
        return 0;
    }
}

class Kubus extends BangunRuang {

    public double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double volume() {
        return sisi * sisi * sisi;
    }

    @Override
    double luasPermukaan() {
        return 6 * sisi * sisi;
    }
}

class Balok extends BangunRuang {

    double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    double luasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    @Override
    double volume() {
        return panjang * lebar * tinggi;
    }
}

class Tabung extends BangunRuang {
    double jari, tinggi;

    Tabung(double jari, double tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    double luasPermukaan() {
        return 2 * Math.PI * jari * tinggi + 2 * Math.PI * jari * jari;
    }

    @Override
    double volume() {
        return Math.PI * jari * jari * tinggi;
    }
}

class Bola extends BangunRuang {

    public Bola(double jari) {
        this.jari = jari;
    }

    double jari;

    @Override
    double volume() {
        return 4 / 3 * Math.PI * (jari * jari * jari);
    }

    @Override
    double luasPermukaan() {
        return 4 * Math.PI * (jari * jari);
    }
}

class Persegi extends BangunDatar {
    double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double luas() {
        return sisi * sisi;
    }

    @Override
    double keliling() {
        return 4 * sisi;
    }
}

class PersegiPanjang extends BangunDatar {
    double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    double luas() {
        return lebar * panjang;
    }

    @Override
    double keliling() {
        return 2 * (panjang + lebar);
    }
}

class Segitiga extends BangunDatar {
    double tinggi, alas, sisi1, sisi2, sisi3;

    public Segitiga(double tinggi, double alas, double sisi1, double sisi2, double sisi3) {
        this.tinggi = tinggi;
        this.alas = alas;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    @Override
    double luas() {
        return 1 / 2 * alas * tinggi;
    }

    @Override
    double keliling() {
        return sisi1 + sisi2 + sisi3;
    }
}

class Lingkaran extends BangunDatar {
    double jari;

    public Lingkaran(double jari) {
        this.jari = jari;
    }

    @Override
    double luas() {
        return Math.PI * jari * jari;
    }

    @Override
    double keliling() {
        return 2 * Math.PI * jari;
    }
}

class Trapesium extends BangunDatar {
    double atas, bawah, kiri, kanan, tinggi;

    public Trapesium(double atas, double bawah, double kiri, double kanan, double tinggi) {
        this.atas = atas;
        this.bawah = bawah;
        this.kiri = kiri;
        this.kanan = kanan;
        this.tinggi = tinggi;
    }

    @Override
    double luas() {
        return 1 / 2 * (atas + bawah) * tinggi;
    }

    @Override
    double keliling() {
        return atas + bawah + kiri + kanan;
    }
}

public class main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== A. Bangun Ruang ===\n1.Kubus\n2.Balok\n3.Bola\n4.Tabung");
        System.out
                .println("=== B. Bangun Datar ===\n1.Persegi\n2.Persegi Panjang\n3.Segitiga\n4.Lingkaran\n5.Trapesium");

        System.out.print("masukkan tipe ");
        String type = sc.nextLine();
        System.out.print("masukkan pilihan ");
        int pil = sc.nextInt();

        switch (type) {
            case "BR":
                switch (pil) {
                    case 1:
                        System.out.println("masukkan sisi");
                        double sisiKubus = sc.nextDouble();
                        Kubus kubus = new Kubus(sisiKubus);
                        System.out.println(kubus.volume());
                        System.out.println(kubus.luasPermukaan());
                        break;

                    case 2:
                        System.out.println("masukkan panjang ");
                        double panjangBalok = sc.nextDouble();
                        System.out.println("masukkan lebarBalok ");
                        double lebarBalok = sc.nextDouble();
                        System.out.println("masukkan lebar ");
                        double tinggiBalok = sc.nextDouble();
                        Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                        balok.volume();
                        balok.luasPermukaan();
                        break;

                    case 3:
                        System.out.println("masukkan jari");
                        double jariBola = sc.nextDouble();
                        Bola bola = new Bola(jariBola);
                        bola.volume();
                        bola.luasPermukaan();
                        break;

                    case 4:
                        System.out.println("masukkan jari");
                        double jariTabung = sc.nextDouble();
                        System.out.println("masukkan tinggi");
                        double tinggiTabung = sc.nextDouble();
                        Tabung tabung = new Tabung(jariTabung, tinggiTabung);
                        tabung.volume();
                        tabung.luasPermukaan();
                        break;
                    default:
                        break;
                }
                break;
            case "BD":
                switch (pil) {
                    case 1:
                        System.out.println("masukkan sisi");
                        double sisi = sc.nextDouble();
                        Persegi persegi = new Persegi(sisi);
                        System.out.println(persegi.luas());
                        System.out.println(persegi.keliling());
                        break;

                    case 2:
                        System.out.println("masukkan panjang");
                        double panjangPersegiPanjang = sc.nextDouble();
                        System.out.println("masukkan lebar");
                        double lebarPersegiPanjang = sc.nextDouble();
                        PersegiPanjang persegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
                        persegiPanjang.luas();
                        persegiPanjang.keliling();
                        break;

                    case 3:
                        System.out.println("masukkan alas");
                        double alasSegitiga = sc.nextDouble();
                        System.out.println("masukkan sisi1");
                        double sisi1Segitiga = sc.nextDouble();
                        System.out.println("masukkan sisi2");
                        double sisi2Segitiga = sc.nextDouble();
                        System.out.println("masukkan sisi3");
                        double sisi3Segitiga = sc.nextDouble();
                        System.out.println("masukkan tinggi");
                        double tinggiSegitiga = sc.nextDouble();
                        Segitiga segitiga = new Segitiga(alasSegitiga, tinggiSegitiga, sisi1Segitiga, sisi2Segitiga,
                                sisi3Segitiga);
                        segitiga.luas();
                        segitiga.keliling();
                        break;

                    case 4:
                        System.out.println("masukkan jari");
                        double jariLingkaran = sc.nextDouble();

                        Lingkaran lingkaran = new Lingkaran(jariLingkaran);
                        lingkaran.luas();
                        lingkaran.keliling();
                        break;

                    case 5:
                        System.out.println("masukkan sisi atas");
                        double atasTrapesium = sc.nextDouble();
                        System.out.println("masukkan sisi bawah");
                        double bawahTrapesium = sc.nextDouble();
                        System.out.println("masukkan sisi kiri");
                        double kiriTrapesium = sc.nextDouble();
                        System.out.println("masukkan sisi kanan");
                        double kananTrapesium = sc.nextDouble();
                        System.out.println("masukkan tinggi");
                        double tinggiTrapesium = sc.nextDouble();
                        Trapesium trapesium = new Trapesium(atasTrapesium, bawahTrapesium, kiriTrapesium,
                                kananTrapesium, tinggiTrapesium);
                        trapesium.luas();
                        trapesium.keliling();
                        break;

                    default:
                        break;
                }
                break;
            default:
                break;
        }
        sc.close();

    }
}
