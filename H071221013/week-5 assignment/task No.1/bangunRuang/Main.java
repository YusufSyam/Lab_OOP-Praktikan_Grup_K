package bangunRuang;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("-".repeat(40));
            System.out.println("   ===== BANGUN RUANG ===== ");
            System.out.println("1. KUBUS");
            System.out.println("2. BALOK");
            System.out.println("3. BOLA");
            System.out.println("4. TABUNG\n");
            System.out.println("   ===== BANGUN DATAR ===== ");
            System.out.println("5. PERSEGI");
            System.out.println("6. PERSEGI PANJANG");
            System.out.println("7. LINGKARAN");
            System.out.println("8. SEGITIGA");
            System.out.println("9. TRAPESIUM");
            System.out.println("-".repeat(40));

            System.out.print("Pilihan: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan sisi kubus: ");
                    double sisiKubus = input.nextDouble();
                    Kubus kubus = new Kubus(sisiKubus);
                    System.out.println("Luas permukaan kubus: " + kubus.luasPermukaan());
                    System.out.println("Volume kubus: " + kubus.volume());
                    System.out.println("-".repeat(40));
                    break;
                    
                case 2:
                    System.out.println("-".repeat(40));
                    System.out.print("Masukkan panjang balok: ");
                    double panjangBalok = input.nextDouble();
                    System.out.print("Masukkan lebar balok: ");
                    double lebarBalok = input.nextDouble();
                    System.out.print("Masukkan tinggi balok: ");
                    double tinggiBalok = input.nextDouble();
                    Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                    System.out.println("Luas permukaan balok: " + balok.luasPermukaan());
                    System.out.println("Volume balok: " + balok.volume());
                    System.out.println("-".repeat(40));
                    break;

                case 3:
                    System.out.println("-".repeat(40));
                    System.out.println("-".repeat(40));
                    System.out.print("Masukkan jari-jari bola: ");
                    double jariJariBola = input.nextDouble();
                    Bola bola = new Bola(jariJariBola);
                    System.out.println("Luas bola: " + bola.luasPermukaan());
                    System.out.println("Volume Bola: " + bola.volume());
                    System.out.println("-".repeat(40));
                    break;

                case 4:
                    System.out.println("-".repeat(40));
                    System.out.print("Masukkan jari-jari tabung: ");
                    double jariJariTabung = input.nextDouble();
                    System.out.print("Masukkan tinggi tabung: ");
                    double tinggiTabung = input.nextDouble();
                    Tabung tabung = new Tabung(jariJariTabung, tinggiTabung);
                    System.out.println("Luas permukaan tabung: " + tabung.luasPermukaan());
                    System.out.println("Volume tabung: " + tabung.Volume());
                    System.out.println("-".repeat(40));
                    break;

                case 5:
                    System.out.println("-".repeat(40));
                    System.out.print("Masukkan sisi persegi: ");
                    double sisiPersegi = input.nextDouble();
                    Persegi persegi = new Persegi(sisiPersegi);
                    System.out.println("Luas persegi: " + persegi.luas());
                    System.out.println("Keliling persegi: " + persegi.keliling());
                    System.out.println("-".repeat(40));
                    break;

                case 6:
                    System.out.println("-".repeat(40));
                    System.out.print("Masukkan panjang persegi panjang: ");
                    double panjangPersegiPanjang = input.nextDouble();
                    System.out.print("Masukkan lebar persegi panjang: ");
                    double lebarPersegiPanjang = input.nextDouble();
                    PersegiPanjang persegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
                    System.out.println("Luas persegi panjang: " + persegiPanjang.luas());
                    System.out.println("Keliling persegi panjang: " + persegiPanjang.keliling());
                    System.out.println("-".repeat(40));
                    break;
                
                case 7:
                    System.out.println("-".repeat(40));
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    double jariJariLingkaran = input.nextDouble();
                    Lingkaran lingkaran = new Lingkaran(jariJariLingkaran);
                    System.out.println("Luas lingkaran: " + lingkaran.luas());
                    System.out.println("Keliling lingkaran: " + lingkaran.keliling());
                    System.out.println("-".repeat(40));
                    break;
    
                case 8:
                    System.out.println("-".repeat(40));
                    System.out.print("Masukkan alas segitiga: ");
                    double alasSegitiga = input.nextDouble();
                    System.out.print("Masukkan tinggi segitiga: ");
                    double tinggiSegitiga = input.nextDouble();
                    Segitiga segitiga = new Segitiga(alasSegitiga, tinggiSegitiga);
                    System.out.println("Luas segitiga: " + segitiga.luas());
                    System.out.println("Keliling segitiga: " + segitiga.keliling());
                    System.out.println("-".repeat(40));
                    break;
    
                case 9:
                    System.out.println("-".repeat(40));
                    System.out.print("Masukkan sisi 1 trapesium: ");
                    double sisi1Trapesium = input.nextDouble();
                    System.out.print("Masukkan sisi 2 trapesium: ");
                    double sisi2Trapesium = input.nextDouble();
                    System.out.print("Masukkan sisi 3 trapesium: ");
                    double sisi3Trapesium = input.nextDouble();
                    System.out.print("Masukkan sisi 4 trapesium: ");
                    double sisi4Trapesium = input.nextDouble();
                    System.out.print("Masukkan tinggi trapesium: ");
                    double tinggiTrapesium = input.nextDouble();
                    Trapesium trapesium = new Trapesium(sisi1Trapesium, sisi2Trapesium, sisi3Trapesium,sisi4Trapesium,tinggiTrapesium);
                    System.out.println("Luas trapesium: " + trapesium.luas());
                    System.out.println("Keliling trapesium: " + trapesium.keliling());
                    System.out.println("-".repeat(40));
                    break;

                case 10:
                    System.out.println("-".repeat(40));
                    System.out.println("Finish");
                    System.out.println("-".repeat(40) + "\n");
                    System.exit(0);
                    break;
            }  
            input.close();     
        }
    }