import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        while (true) {
            System.out.println("=".repeat(45));
            System.out.println(" ".repeat(12) +"~ Tampilan Menu ~" );
            System.out.println("=".repeat(45));
            System.out.println(" ".repeat(12) +"~ BANGUN RUANG ~" );
            System.out.println("=".repeat(45));
            System.out.println("1. KUBUS");
            System.out.println("2. BALOK");
            System.out.println("3. BOLA");
            System.out.println("4. TABUNG");
            System.out.println("=".repeat(45));
            System.out.println(" ".repeat(12) +"~ BANGUN DATAR ~" );
            System.out.println("=".repeat(45));
            System.out.println("5. PERSEGI");
            System.out.println("6. PERSEGI PANJANG");
            System.out.println("7. LINGKARAN");
            System.out.println("8. SEGITIGA");
            System.out.println("9. TRAPESIUM");
            System.out.println("10. KELUAR");
            System.out.println("=".repeat(45));

            System.out.print("Pilihan: ");
            int pilihan = inp.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("-".repeat(45));
                    System.out.print("Masukkan sisi kubus: ");
                    double sisiKubus = inp.nextDouble();
                    Kubus kubus = new Kubus(sisiKubus);
                    System.out.println("volume kubus: " + kubus.volume());
                    System.out.println("Luas permukaan kubus: " + kubus.luasPermukaan());
                    System.out.println("-".repeat(45));
                    break;
                    
                case 2:
                    System.out.println("-".repeat(45));
                    System.out.print("Masukkan panjang balok: ");
                    double panjangBalok = inp.nextDouble();
                    System.out.print("Masukkan lebar balok: ");
                    double lebarBalok = inp.nextDouble();
                    System.out.print("Masukkan tinggi balok: ");
                    double tinggiBalok = inp.nextDouble();
                    Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                    System.out.println("volume balok: " + balok.volume());
                    System.out.println("Luas permukaan balok: " + balok.luasPermukaan());
                    System.out.println("-".repeat(45));
                    break;

                case 3:
                    System.out.println("-".repeat(45));
                    System.out.print("Masukkan jari-jari bola: ");
                    double jariJariBola = inp.nextDouble();
                    Bola bola = new Bola(jariJariBola);
                    System.out.println("Luas bola: " + bola.luasPermukaan());
                    System.out.println("volume Bola: " + bola.volume());
                    break;

                case 4:
                    System.out.println("-".repeat(45));
                    System.out.print("Masukkan jari-jari tabung: ");
                    double jariJariTabung = inp.nextDouble();
                    System.out.print("Masukkan tinggi tabung: ");
                    double tinggiTabung = inp.nextDouble();
                    Tabung tabung = new Tabung(jariJariTabung, tinggiTabung);
                    System.out.println("volume tabung: " + tabung.volume());
                    System.out.println("Luas permukaan tabung: " + tabung.luasPermukaan());
                    System.out.println("-".repeat(45));
                    break;

                case 5:
                    System.out.println("-".repeat(45));
                    System.out.print("Masukkan sisi persegi: ");
                    double sisiPersegi = inp.nextDouble();
                    Persegi persegi = new Persegi(sisiPersegi);
                    System.out.println("Luas persegi: " + persegi.luas());
                    System.out.println("Keliling persegi: " + persegi.keliling());
                    System.out.println("-".repeat(45));
                    break;

                case 6:
                    System.out.println("-".repeat(45));
                    System.out.print("Masukkan panjang persegi panjang: ");
                    double panjangPersegiPanjang = inp.nextDouble();
                    System.out.print("Masukkan lebar persegi panjang: ");
                    double lebarPersegiPanjang = inp.nextDouble();
                    PersegiPanjang persegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
                    System.out.println("Luas persegi panjang: " + persegiPanjang.luas());
                    System.out.println("Keliling persegi panjang: " + persegiPanjang.keliling());
                    System.out.println("-".repeat(45));
                    break;

                
                case 7:
                    System.out.println("-".repeat(45));
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    double jariJariLingkaran = inp.nextDouble();
                    Lingkaran lingkaran = new Lingkaran(jariJariLingkaran);
                    System.out.println("Luas lingkaran: " + lingkaran.luas());
                    System.out.println("Keliling lingkaran: " + lingkaran.keliling());
                    System.out.println("-".repeat(45));
                    break;
                    
                case 8:
                    System.out.println("-".repeat(45));
                    System.out.print("Masukkan alas segitiga: ");
                    double alasSegitiga = inp.nextDouble();
                    System.out.print("Masukkan tinggi segitiga: ");
                    double tinggiSegitiga = inp.nextDouble();
                    System.out.print("Masukkan sisi1: ");
                    double sisi1 = inp.nextDouble();
                    System.out.print("Masukkan sisi2: ");
                    double sisi2 = inp.nextDouble();
                    System.out.print("Masukkan sisi3: ");
                    double sisi3 = inp.nextDouble();
                    Segitiga segitiga = new Segitiga(alasSegitiga, tinggiSegitiga, sisi1, sisi2, sisi3);
                    System.out.println("Luas segitiga: " + segitiga.luas());
                    System.out.println("Keliling segitiga: " + segitiga.keliling());
                    System.out.println("-".repeat(45));
                    break;
    
                case 9:
                    System.out.println("-".repeat(45));
                    System.out.print("Masukkan sisi 1 trapesium: ");
                    double sisi1Trapesium = inp.nextDouble();
                    System.out.print("Masukkan sisi 2 trapesium: ");
                    double sisi2Trapesium = inp.nextDouble();
                    System.out.print("Masukkan sisi 3 trapesium: ");
                    double sisi3Trapesium = inp.nextDouble();
                    System.out.print("Masukkan sisi 4 trapesium: ");
                    double sisi4Trapesium = inp.nextDouble();
                    System.out.print("Masukkan tinggi trapesium: ");
                    double tinggiTrapesium = inp.nextDouble();
                    Trapesium trapesium = new Trapesium(sisi1Trapesium, sisi2Trapesium, sisi3Trapesium,sisi4Trapesium,tinggiTrapesium);
                    System.out.println("Luas trapesium: " + trapesium.luas());
                    System.out.println("Keliling trapesium: " + trapesium.keliling());
                    System.out.println("-".repeat(45));
                    break;

                case 10:
                    System.out.println("-".repeat(45));
                    System.out.println("SELAMAT TINGGAL");
                    System.out.println("-".repeat(45) + "\n");
                    inp.close();
                    System.exit(0);
                    break;
    
                default:
                    System.out.println("Pilihan tidak tersedia.");
                    break; 
            }       
        }
             
    }
}