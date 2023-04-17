import java.util.Scanner;
import java.lang.Math;

class BangunRuang {
    private String jenis;
    
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public double volume() {
        return 0;
    }

    public double luasPermukaan() {
        return 0;
    }
}

class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double volume() {
        return Math.pow(sisi, 3);
    }

    @Override
    public double luasPermukaan() {
        return 6 * Math.pow(sisi, 2);
    }

    public void infoKubus(){
        System.out.println("Kubus adalah bangun ruang tiga dimensi yang memiliki enam sisi yang sama besar dan berbentuk segi empat sama sisi. Setiap sisinya bertemu dengan tiga sisi lainnya membentuk sudut siku-siku. Kubus juga memiliki 12 rusuk yang sama panjang dan 8 titik sudut yang sama besar. ");
    }
}

class Balok extends BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return panjang * lebar * tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
    public void infoBalok(){
        System.out.println("Balok adalah bangun ruang tiga dimensi yang memiliki enam sisi, di mana masing-masing sisi berbentuk persegi panjang. Balok memiliki 12 rusuk, 8 titik sudut, dan 6 bidang. ");
    }
}

class Bola extends BangunRuang {
    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }

    @Override
    public double luasPermukaan() {
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }
    public void infoBola(){
        System.out.println("Bola adalah bangun ruang tiga dimensi yang berbentuk bulat sempurna dan memiliki radius yang sama dari setiap titik di permukaannya ke pusatnya. Bola tidak memiliki rusuk, titik sudut, atau bidang. ");
    }
}

class Tabung extends BangunRuang {
    private double jariJari;
    private double tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 2 * Math.PI * jariJari * (jariJari + tinggi);
    }
    public void infoTabung(){
        System.out.println("Tabung adalah bangun ruang tiga dimensi yang terdiri dari dua lingkaran dengan radius yang sama yang terhubung oleh sebuah silinder. Tabung memiliki 3 dimensi yaitu: jari-jari alas, tinggi, dan jari-jari silinder. ");
    }
}

class BangunDatar {
    private String jenis;
    
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public double luas() {
        return 0;
    }

    public double keliling() {
        return 0;
    }
}

class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }

    @Override
    public double keliling() {
        return 4 * sisi;
    }
    public void infoPersegi(){
        System.out.println("Persegi adalah bentuk geometris yang memiliki empat sisi yang sama panjang dan empat sudut yang sama besar. Persegi juga merupakan jenis khusus dari segi empat sama sisi.");
    }
}

class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double luas() {
        return panjang * lebar;
    }

    @Override
    public double keliling() {
        return 2 * (panjang + lebar);
    }
    public void infoPersegiPanjang(){
        System.out.println("Persegi panjang adalah bentuk geometris yang memiliki dua pasang sisi sejajar yang sama panjang dan keempat sudut yang sama besar.");
    }
}

class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double luas() {
        return Math.PI * Math.pow(jariJari, 2);
    }

    @Override
    public double keliling() {
        return 2 * Math.PI * jariJari;
    }
    public void infoLingkaran(){
        System.out.println("Lingkaran adalah bentuk geometris yang memiliki setiap titik pada permukaannya berjarak sama dari pusatnya. Lingkaran juga memiliki diameter yang merupakan jarak terpanjang antara dua titik di permukaannya dan radius yang setengah dari diameter.");
    }
}

class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisiA;
    private double sisiB;
    private double sisiC;

    public Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    @Override
    public double luas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double keliling() {
        return sisiA + sisiB + sisiC;
    }
    public void infoSegitiga(){
        System.out.println("Segitiga adalah bentuk geometris yang memiliki tiga sisi dan tiga sudut. Ada beberapa jenis segitiga, seperti segitiga sama sisi, segitiga sama kaki, dan segitiga sembarang.");
    }
}

class Trapesium extends BangunDatar {
    private double sisiAtas;
    private double sisiBawah;
    private double tinggi;
    private double sisiKanan;
    private double sisiKiri;


    public Trapesium(double sisiAtas, double sisiBawah, double tinggi, double sisiKanan, double sisiKiri) {
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.tinggi = tinggi;
        this.sisiKanan = sisiKanan;
        this.sisiKiri = sisiKiri;
    }

    @Override
    public double luas() {
        return 0.5 * (sisiAtas + sisiBawah) * tinggi;
    }

    @Override
    public double keliling() {
        return sisiAtas + sisiBawah + sisiKanan + sisiKiri;
    }
    public void infoTrapesium(){
        System.out.println("Trapesium adalah bentuk geometris yang memiliki dua sisi sejajar dan dua sisi yang tidak sejajar. Ada beberapa jenis trapesium, seperti trapesium sama kaki dan trapesium sembarang. ");
    }
}

// contoh penggunaan
public class Bangun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // behavior menu();
        System.out.println("======== MENU ========\n==== BANGUN RUANG ====");
        System.out.println("(1) KUBUS\n(2) BALOK\n(3) BOLA\n(4) TABUNG\n");
        System.out.println("==== BANGUN DATAR ====");
        System.out.println("(1) PERSEGI\n(2) PERSEGI PANJANG\n(3) LINGKARAN\n(4) SEGITIGA\n(5) TRAPESIUM\n");
        System.out.print("Bangun Ruang atau Bangun Datar (BR/BD)?\n => ");
        String pilihan = input.nextLine();
        switch(pilihan){
            case "BR":
                System.out.println("\n==== BANGUN RUANG ====");
                System.out.println("(1) KUBUS\n(2) BALOK\n(3) BOLA\n(4) TABUNG");
                System.out.print("\nPilih Bangun Ruang \n=> ");
                String pilihBangunRuang = input.nextLine();
                switch(pilihBangunRuang){
                    case "1":
                        System.out.print("Panjang Sisi : ");
                        double sisiKubus = input.nextDouble();

                        Kubus kubus = new Kubus(sisiKubus);
                        System.out.println("\nVolume = " + kubus.volume());
                        System.out.println("Luas Permukaan = " + kubus.luasPermukaan());
                        break;

                    case "2":
                        System.out.print("Panjang Balok : ");
                        double panjangBalok = input.nextDouble();
                        System.out.print("Lebar Balok : ");
                        double lebarBalok = input.nextDouble();
                        System.out.print("Tinggi Balok : ");
                        double tinggiBalok = input.nextDouble();

                        Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                        System.out.println("\nVolume = " + balok.volume());
                        System.out.println("Luas Permukaan = " + balok.luasPermukaan());
                        break;

                    case "3":
                        System.out.print("Jari-Jari Bola : ");
                        double jariJariBola = input.nextDouble();

                        Bola bola = new Bola(jariJariBola);
                        System.out.println("\nVolume = " + bola.volume());
                        System.out.println("Luas Permukaan = " + bola.luasPermukaan());
                        break; 

                    case "4":
                        System.out.print("Jari-Jari Tabung : ");
                        double jariJariTabung = input.nextDouble();
                        System.out.print("Tinggi Tabung : ");
                        double tinggiTabung = input.nextDouble();

                        Tabung tabung = new Tabung(jariJariTabung, tinggiTabung);
                        System.out.println("\nVolume = " + tabung.volume());
                        System.out.println("Luas Permukaan = " + tabung.luasPermukaan());
                        break;        
                }break;     

            case "BD":
                System.out.println("\n==== BANGUN DATAR ====");
                System.out.println("(1) PERSEGI\n(2) PERSEGI PANJANG\n(3) LINGKARAN\n(4) SEGITIGA\n(5) TRAPESIUM\n");
                System.out.print("Pilih Bangun Datar \n=> ");
                String pilihBangunDatar = input.nextLine();
                switch(pilihBangunDatar){    
                    case "1":  
                        System.out.print("Sisi Persegi : ");
                        double sisiPersegi = input.nextDouble();

                        Persegi persegi = new Persegi(sisiPersegi);
                        System.out.println("\nLuas = " + persegi.luas());
                        System.out.println("Keliling = " + persegi.keliling());
                        break;
                        
                    case "2":
                        System.out.print("Panjang : ");
                        double panjangPersgiPanjang = input.nextDouble();
                        System.out.print("Lebar : ");
                        double lebarPersgiPanjang = input.nextDouble();

                        PersegiPanjang persegipanjang = new PersegiPanjang(panjangPersgiPanjang, lebarPersgiPanjang);
                        System.out.println("\nLuas = " + persegipanjang.luas());
                        System.out.println("Keliling = " + persegipanjang.keliling());
                        break; 

                    case "3":
                        System.out.print("Jari-Jari Lingkaran : ");
                        double jariJari = input.nextDouble();

                        Lingkaran lingkaran = new Lingkaran(jariJari);
                        System.out.println("\nLuas = " + lingkaran.luas());
                        System.out.println("Keliling = " + lingkaran.keliling());
                        break;

                    case "4":
                        System.out.print("Alas : ");
                        double alas = input.nextDouble();
                        System.out.print("Tinggi : ");
                        double tinggiSegitiga = input.nextDouble();
                        System.out.print("Sisi A : ");
                        double sisiA = input.nextDouble();
                        System.out.print("Sisi B : ");
                        double sisiB = input.nextDouble();
                        System.out.print("Sisi C : ");
                        double sisiC = input.nextDouble();

                        Segitiga segitiga = new Segitiga(alas, tinggiSegitiga, sisiA, sisiB, sisiC);
                        System.out.println("\nLuas = " + segitiga.luas());
                        System.out.println("Keliling = " + segitiga.keliling());
                        break; 
                    
                    case "5":
                        System.out.print("Tinggi : ");
                        double tinggiTrapesium = input.nextDouble();
                        System.out.print("Sisi Atas : ");
                        double sisiAtas = input.nextDouble();
                        System.out.print("Sisi Bawah : ");
                        double sisiBawah = input.nextDouble();
                        System.out.print("Sisi Kanan : ");
                        double sisiKanan = input.nextDouble();
                        System.out.print("Sisi Kiri : ");
                        double sisiKiri = input.nextDouble();

                        Trapesium trapesium = new Trapesium(tinggiTrapesium, sisiAtas, sisiBawah, sisiKanan, sisiKiri);
                        System.out.println("\nLuas = " + trapesium.luas());
                        System.out.println("Keliling = " + trapesium.keliling());
                        break; 
            }break;
        } 
        input.close();          
    }
}