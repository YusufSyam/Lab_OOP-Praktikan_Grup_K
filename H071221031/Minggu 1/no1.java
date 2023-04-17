import java.util.Scanner;
public class no1 {
    public static void main(String[] args) {
        String nim; 
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIM : ");
        // membuat inputan nim
        nim = input.nextLine();
        String nimAkhir = nim.substring(8);
        // mengambil nilai string mulai dari indeks 8

        int digit = Integer.parseInt(nimAkhir);
        // mengubah string menjadi integer

        if (digit%7==1 ) {
            System.out.println("Soal : no 1 ");
        } else if (digit%7==2 ) {
            System.out.print("Soal : no 2");
        } else if (digit%7==3 ) {
            System.out.println("Soal : no 3");
        } else if (digit%7==4 ) {
            System.out.println("Soal : no 4");
        } else if (digit%7==5 ) {
            System.out.println("Soal : no 5");            
        } else if (digit%7==6 ) {
            System.out.println("Soal : no 6");
        } else if (digit%7==0 ) {
            System.out.println("Soal : no 7");
        }
        }
        // membuat kondisi untuk pembagian soal

    }
