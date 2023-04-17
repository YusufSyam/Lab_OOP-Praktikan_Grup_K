import java.sql.SQLOutput;
import java.util.Scanner;


//superclass untuk Bangun Ruang
class BangunRuang {
    double luasPermukaan;
    double volume;
}

// subclass untuk kubus
class Kubus extends BangunRuang {
    double sisi;

    public Kubus(double s){
        sisi = s;
        luasPermukaan = 6*sisi*sisi;
        volume = sisi*sisi*sisi;
    }

    public double hitungLuasPermukaan() {
        return luasPermukaan;
    }

    public double hitungVolume(){
        return volume;
    }
}

//subclass untuk Balok
class Balok extends BangunRuang {
    double panjang;
    double lebar;
    double tinggi;

    //constructor
    public Balok(double p, double l, double t) {
        panjang = p;
        lebar = l;
        tinggi = t;

        luasPermukaan = 2 * ((panjang*lebar) + (panjang * tinggi) + (lebar*tinggi));
        volume = panjang*lebar*tinggi;
    }

    public double hitungLuasPermukaan() {
        return luasPermukaan;
    }

    public double hitungVolume(){
        return volume;
    }
}

// subclass untuk bola
class Bola extends BangunRuang {
    double jari;

    //constructor
    public Bola(double r) {
        jari = r;
        luasPermukaan = 4 * Math.PI * jari * jari;
        volume = 4.0 / 3.0 * Math.PI * jari * jari * jari;
    }

    public double hitungLuasPermukaan() {
        return luasPermukaan;
    }

    public double hitungVolume(){
        return volume;
    }
}

//subclass untuk Tabung
class Tabung extends BangunRuang{
    double jari;
    double tinggi;

    public Tabung(double r, double t) {
        jari = r;
        tinggi = t;
        luasPermukaan = 2 * Math.PI * jari * (jari + tinggi);
        volume = Math.PI * jari * jari * tinggi;
    }
    public double hitungLuasPermukaan() {
        return luasPermukaan;
    }

    public double hitungVolume(){
        return volume;
    }
}

//Superclass untuk Bangun Datar
class bangunDatar {
    double luas;
    double keliling;
}

//subclass untuk Persegi
class Persegi extends bangunDatar {
    double sisi;

    //constructor
    public Persegi(double s) {
        sisi =  s;
        luas = sisi*sisi;
        keliling = 4 * sisi;
    }
    public double hitungLuas() {
        return luas;
    }

    public double hitungKeliling(){
        return keliling;
    }
}

//subclass untuk persegi panjang
class PersegiPanjang extends bangunDatar {
    double panjang;
    double lebar;

    //constructor
    public PersegiPanjang(double p, double l){
        panjang = p;
        lebar = l;
        luas = panjang * lebar;
        keliling = 2 * (panjang + lebar);
    }

    public double hitungLuas() {
        return luas;
    }

    public double hitungKeliling(){
        return keliling;
    }
}

//subclass untuk lingkaran
class Lingkaran extends bangunDatar {
    double jari;

    //constructor
    public Lingkaran(double r){
        jari= r;
        luas = Math.PI * jari * jari;
        keliling = 2 * Math.PI * jari;
    }
    public double hitungLuas() {
        return luas;
    }

    public double hitungKeliling(){
        return keliling;
    }
}

//subclass untuk segitiga

class Segitiga extends bangunDatar {
    double alas;
    double tinggi;
    double sisi1;
    double sisi2;
    double sisi3;

    //constructor
    public Segitiga(double a, double t, double s1, double s2, double s3) {
        alas = a;
        tinggi = t;
        sisi1 = s1;
        sisi2 = s2;
        sisi3 = s3;
        luas = 0.5 * alas * tinggi;
        keliling = sisi1 + sisi2 + sisi3;
    }
    public double hitungLuas() {
        return luas;
    }

    public double hitungKeliling(){
        return keliling;
    }
}

class Trapesium extends bangunDatar{
    double sisiAtas;
    double sisiBawah;
    double tinggiTrapesium;
    double sisiMiring;

    //constructor
    public Trapesium (double sa, double sb, double t, double sm) {
        sisiAtas = sa;
        sisiBawah = sb;
         tinggiTrapesium = t;
        sisiMiring = sm;
        luas = 0.5 * (sisiAtas + sisiBawah) * tinggiTrapesium;
        keliling = sisiAtas + sisiBawah + (2 * sisiMiring);
    }
    public double hitungLuas() {
        return luas;
    }

    public double hitungKeliling(){
        return keliling;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do{
            System.out.println("=====BANGUN RUANG======");
            System.out.println("1. KUBUS");
            System.out.println("2. BALOK");
            System.out.println("3. BOLA");
            System.out.println("4. TABUNG");
            System.out.println("=======================");
            System.out.println("=====BANGUN DATAR======");
            System.out.println("5. PERSEGI");
            System.out.println("6. PERSEGI PANJANG");
            System.out.println("7. LINGKARAN");
            System.out.println("8. SEGITIGA");
            System.out.println("9. TRAPESIUM");
            System.out.println("=======================");
            System.out.print("Masukkan pilihan: ");
            pilihan = sc.nextInt();
        } while (pilihan < 1 || pilihan > 9);

        switch(pilihan) {
            case 1:
                System.out.print("Masukkan sisi kubus: ");
                double sisiKubus = sc.nextDouble();
                Kubus kubus = new Kubus(sisiKubus);
                System.out.println("Luas permukaan kubus: " + kubus.hitungLuasPermukaan());
                System.out.println("Volume kubus: " + kubus.hitungVolume());
                break;
            case 2:
                System.out.print("Masukkan panjang balok: ");
                double panjangBalok = sc.nextDouble();
                System.out.print("Masukkan lebar balok: ");
                double lebarBalok = sc.nextDouble();
                System.out.print("Masukkan tinggi balok: ");
                double tinggiBalok = sc.nextDouble();
                Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                System.out.println("Luas permukaan balok: " + balok.hitungLuasPermukaan());
                System.out.println("Volume balok: " + balok.hitungVolume());
                break;
            case 3:
                System.out.print("Masukkan jari-jari bola: ");
                double jariBola = sc.nextDouble();
                Bola bola = new Bola(jariBola);
                System.out.println("Luas permukaan bola: " + bola.hitungLuasPermukaan());
                System.out.println("Volume bola: " + bola.hitungVolume());
                break;
            case 4:
                System.out.print("Masukkan jari-jari tabung: ");
                double jariTabung = sc.nextDouble();
                System.out.print("Masukkan tinggi tabung: ");
                double tinggiTabung = sc.nextDouble();
                Tabung tabung = new Tabung(jariTabung, tinggiTabung);
                System.out.println("Luas permukaan tabung: " + tabung.hitungLuasPermukaan());
                System.out.println("Volume tabung: " + tabung.hitungVolume());
                break;
            case 5:
                System.out.println();
                System.out.print("Masukkan sisi persegi : ");
                double sisi = sc.nextDouble();
                Persegi persegi = new Persegi(sisi);
                System.out.println("Luas permukaan persegi: " + persegi.hitungLuas());
                System.out.println("Volume persegi: " + persegi.hitungKeliling());
                break;
            case 6:
                System.out.println();
                System.out.print("Masukkan panjang persegi panjang : ");
                double panjangPersegiPanjang = sc.nextDouble();
                System.out.print("Masukkan lebar persegi panjang : ");
                double lebarPersegiPanjang = sc.nextDouble();
                PersegiPanjang persegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
                System.out.println("Luas persegi panjang: " + persegiPanjang.hitungLuas());
                System.out.println("Keliling persegi panjang: " + persegiPanjang.hitungKeliling());
                break;
            case 7:
                System.out.println();
                System.out.print("Masukkan jari-jari lingkaran : ");
                double jariJariLingkaran = sc.nextDouble();
                Lingkaran lingkaran = new Lingkaran(jariJariLingkaran);
                System.out.println("Luas lingkaran: " + lingkaran.hitungLuas());
                System.out.println("Keliling lingkaran: " + lingkaran.hitungKeliling());
                break;
            case 8:
                System.out.println();
                System.out.print("Masukkan alas segitiga : ");
                double alas = sc.nextDouble();
                System.out.print("Masukkan tinggi segitiga : ");
                double tinggi = sc.nextDouble();
                System.out.print("Masukkan sisi1 segitiga : ");
                double sisi1 = sc.nextDouble();
                System.out.print("Masukkan sisi1 segitiga : ");
                double sisi2 = sc.nextDouble();
                System.out.print("Masukkan sisi1 segitiga : ");
                double sisi3 = sc.nextDouble();
                Segitiga segitiga = new Segitiga(alas, tinggi, sisi1, sisi2, sisi3);
                System.out.println("Luas segitiga: " + segitiga.hitungLuas());
                System.out.println("Keliling segitiga: " + segitiga.hitungKeliling());
                break;
            case 9:
                System.out.println();
                System.out.print("Masukkan sisi atas trapesium : ");
                double sisiAtas = sc.nextDouble();
                System.out.print("Masukkan sisi bawah trapesium : ");
                double sisiBawah = sc.nextDouble();
                System.out.print("Masukkan tinggi trapesium : ");
                double tinggiTrapesium = sc.nextDouble();
                System.out.print("Masukkan sisi miring trapesium : ");
                double sisiMiring = sc.nextDouble();
                Trapesium trapesium = new Trapesium(sisiAtas, sisiBawah, tinggiTrapesium, sisiMiring);
                System.out.println("Luas trapesium: " + trapesium.hitungLuas());
                System.out.println("Keliling trapesium: " + trapesium.hitungKeliling());
                break;
            case 0:
                System.out.println("Terima kasih telah menggunakan program ini");
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                break;
        }
        System.out.println();
    }
}