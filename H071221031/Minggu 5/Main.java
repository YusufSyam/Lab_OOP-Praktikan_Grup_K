import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.println("==== BANGUN RUANG ====");
    System.out.println("1. KUBUS");
    System.out.println("2. BALOK");
    System.out.println("3. BOLA");
    System.out.println("4. TABUNG");

    System.out.println("==== BANGUN DATAR ====");
    System.out.println("5. PERSEGI");
    System.out.println("6. PERSEGI PANJANG");
    System.out.println("7. LINGKARAN");
    System.out.println("8. SEGITIGA");
    System.out.println("9. TRAPESIUM");
    System.out.print("Pilih bangun: ");
    int pilihan = sc.nextInt();

    switch (pilihan){
        case 1:
        System.out.print("Masukkan sisi: ");
        double sisi = sc.nextDouble();
        Kubus kubus = new Kubus(sisi);
        System.out.println("Luas Permukaan Kubus : " +kubus.luasPermukaan());
        System.out.println("Valome Kubus : " +kubus.volume());
        break;

        case 2:
        System.out.println("Masukan Panjang: ");
        double panjang = sc.nextDouble();
        System.out.println("Masukkan Lebar: ");
        double lebar = sc.nextDouble();
        System.out.println("Masukkan Tinggi: ");
        double tinggi = sc.nextDouble();
        Balok balok = new Balok(panjang, lebar, tinggi);
        System.out.println("Luas Permukaan Balok : " +balok.luasPermukaan());
        System.out.println("Volume Balok : " +balok.volume());
        break;
        
        case 3 :
        System.out.println("Masukkan Jari jari: ");
        double jariJariBola = sc.nextDouble();
        Bola bola = new Bola(jariJariBola);
        System.out.println("Luas Permukaan Bola : " +bola.luasPermukaan());
        System.out.println("Volume Bola : " +bola.volume());
        break;

        case 4:
        System.out.println("Masukkan Jari Jari : ");
        double jariJariTabung = sc.nextDouble();
        System.out.println("Masukkan Tinggi : ");
        double tinggiTabung = sc.nextDouble();
        Tabung tabung = new Tabung(jariJariTabung, tinggiTabung);
        System.out.println("Luas Permukaan Tabung : " +tabung.luasPermukaan());
        System.out.println("Volume Tabung : " +tabung.volume());
        break;

        case 5:
        System.out.println("Masukkan Sisi : ");
        double sisiPersegi = sc.nextDouble();
        Persegi persegi = new Persegi(sisiPersegi);
        System.out.println("Keliling Persegi : " +persegi.keliling());
        System.out.println("Luas Persegi : " +persegi.luas());
        break;

        case 6 :
        System.out.println("Masukkan Panjang : ");
        double panjangPersegiPanjang = sc.nextDouble();
        System.out.println("Masukkan Lebar : ");
        double lebarPersegiPanjang = sc.nextDouble();
        PersegiPanjang persegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
        System.out.println("Keliling Persegi Panjang : " +persegiPanjang.keliling());
        System.out.println("Volume Persegi Panjang : " +persegiPanjang.luas());
        break;

        case 7 :
        System.out.println("Masukkan Jari jari : ");
        double jariJariLingkaran = sc.nextDouble();
        Lingkaran lingkaran = new Lingkaran(jariJariLingkaran);
        System.out.println("Keliling Lingkaran : " +lingkaran.keliling());
        System.out.println("Luas Lingkaran : " +lingkaran.luas());
        break;

        case 8 :
        System.out.println("Masukkan Alas : ");
        double alas =sc.nextDouble();
        System.out.println("Masukkan Tinggi : ");
        double tinggiSegitiga = sc.nextDouble();
        System.out.println("Masukkan sisi 1 : ");
        double sisi1 = sc.nextDouble();
        System.out.println("Masukkan sisi 2 : ");
        double sisi2 = sc.nextDouble();
        System.out.println("Masukkan sisi 3 : ");
        double sisi3 = sc.nextDouble();
        Segitiga segitiga = new Segitiga(alas, tinggiSegitiga, sisi1, sisi2, sisi3);
        System.out.println("Keliling Segitiga : " +segitiga.keliling());
        System.out.println("Luas Segitiga : " +segitiga.luas());
        break;

        case 9 :
        System.out.println("Masukkan Tinggi : ");
        double tinggiTrapesium = sc.nextDouble();
        System.out.println("Masukkan sisi Sejajar 1 : ");
        double sisiSejajar1 = sc.nextDouble();
        System.out.println("Masukkan sisi Sejajar 2 : ");
        double sisiSejajar2 = sc.nextDouble();
        System.out.println("Masukkan sisi Sejajar 3 : ");
        double sisiSejajar3 = sc.nextDouble();
        System.out.println("Masukkan sisi Sejajar 4 : ");
        double sisiSejajar4 = sc.nextDouble();
        Trapesium trapesium =new Trapesium(tinggiTrapesium, sisiSejajar1, sisiSejajar2, sisiSejajar3, sisiSejajar4);
        System.out.println("Keliling Trapesium : "  +trapesium.keliling());
        System.out.println("Luas Trapesium : " +trapesium.luas());
        break;
        
        default:
            System.out.println("Pilihan tidak tersedia.");
            break;
    }
    }
}