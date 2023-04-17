import java.util.Scanner;

public class Bangunan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // behavior menu();
        System.out.println("===BANGUN RUANG===");
        System.out.println("(1) KUBUS\n(2) BALOK\n(3) BOLA\n(4) TABUNG\n");
        System.out.println("==== BANGUN DATAR ====");
        System.out.println("(1) PERSEGI\n(2) PERSEGI PANJANG\n(3) LINGKARAN\n(4) SEGITIGA\n(5) TRAPESIUM\n");
        System.out.print("Bangun Ruang atau Bangun Datar (BR/BD)?\n => ");
        String pilihan = input.nextLine();
        if(pilihan.equalsIgnoreCase("BR")){
            System.out.println("\n==== BANGUN RUANG ====");
            System.out.println("(1) KUBUS\n(2) BALOK\n(3) BOLA\n(4) TABUNG");
            System.out.print("\nPilih Bangun Ruang \n=> ");
            String pilihBangunRuang = input.nextLine();
            if (pilihBangunRuang.equalsIgnoreCase("1")){
                System.out.print("Panjang Sisi : ");
                double sisiKubus = input.nextDouble();

                Kubus kubus = new Kubus(sisiKubus);
                System.out.println("\nVolume = " + kubus.volume());
                System.out.println("Luas Permukaan = " + kubus.luasPermukaan());
                }       

            else if(pilihBangunRuang.equalsIgnoreCase("2")) {
                System.out.print("Panjang Balok : ");
                double panjangBalok = input.nextDouble();
                System.out.print("Lebar Balok : ");
                double lebarBalok = input.nextDouble();
                System.out.print("Tinggi Balok : ");
                double tinggiBalok = input.nextDouble();

                Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                System.out.println("\nVolume = " + balok.volume());
                System.out.println("Luas Permukaan = " + balok.luasPermukaan());
            }
            else if (pilihBangunRuang.equalsIgnoreCase("3")) {
                System.out.print("Jari-Jari Bola : ");
                double jariJariBola = input.nextDouble();

                Bola bola = new Bola(jariJariBola);
                System.out.println("\nVolume = " + bola.volume());
                System.out.println("Luas Permukaan = " + bola.luasPermukaan());
            }

            else if (pilihBangunRuang.equalsIgnoreCase("4")) {
                System.out.print("Jari-Jari Tabung : ");
                double jariJariTabung = input.nextDouble();
                System.out.print("Tinggi Tabung : ");
                double tinggiTabung = input.nextDouble();

                Tabung tabung = new Tabung(jariJariTabung, tinggiTabung);
                System.out.println("\nVolume = " + tabung.volume());
                System.out.println("Luas Permukaan = " + tabung.luasPermukaan());
            }       
        }   

        if (pilihan.equalsIgnoreCase("BD")) {
            System.out.println("\n============ BANGUN DATAR ===============");
            System.out.println("(1) PERSEGI\n(2) PERSEGI PANJANG\n(3) LINGKARAN\n(4) SEGITIGA\n(5) TRAPESIUM\n");
            System.out.print("Pilih Bangun Datar \n=> ");
            String pilihBangunDatar = input.nextLine();
            if (pilihBangunDatar.equalsIgnoreCase("1")){    
                System.out.print("Sisi Persegi : ");
                double sisiPersegi = input.nextDouble();

                Persegi persegi = new Persegi(sisiPersegi);
                System.out.println("\nLuas = " + persegi.luas());
                System.out.println("Keliling = " + persegi.keliling());
        }
                
            else if (pilihBangunDatar.equalsIgnoreCase("2")) {
                System.out.print("Panjang : ");
                double panjangPersgiPanjang = input.nextDouble();
                System.out.print("Lebar : ");
                double lebarPersgiPanjang = input.nextDouble();

                PersegiPanjang persegipanjang = new PersegiPanjang(panjangPersgiPanjang, lebarPersgiPanjang);
                System.out.println("\nLuas = " + persegipanjang.luas());
                System.out.println("Keliling = " + persegipanjang.keliling());
            } 

            else if (pilihBangunDatar.equalsIgnoreCase("3")) {
                System.out.print("Jari-Jari Lingkaran : ");
                double jariJari = input.nextDouble();

                Lingkaran lingkaran = new Lingkaran(jariJari);
                System.out.println("\nLuas = " + lingkaran.luas());
                System.out.println("Keliling = " + lingkaran.keliling());
            }

            else if (pilihBangunDatar.equalsIgnoreCase("4")) {
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
            }
            
            else if (pilihBangunDatar.equalsIgnoreCase("5")) {
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
            }
        }
        input.close();          
    } 
}
