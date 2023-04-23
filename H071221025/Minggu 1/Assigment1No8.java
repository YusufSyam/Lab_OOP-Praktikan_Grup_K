import java.util.Scanner;

public class Assigment1No8 {
    public static void main(String[] args) {
        int[][] matriks = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Scanner inp = new Scanner(System.in);
        System.out.println("Masukkan angka yang di cari : ");
        int angka = 1;

        try{
            angka = Integer.parseInt(inp.nextLine());
        } catch (Exception e) {
            System.out.println("Inputan harus berupa bilangan bulat positif");
            inp.close();
        }
        boolean cari = false;
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++){
                if (matriks[i][j] == angka) {
                    System.out.printf("Found %d at [%d][%d]", angka, i, j );
                    cari = true;
                }
            }
        }
        if (!cari) {
            System.out.printf("Bilangan %d tidak dapat ditemukan\n", angka);
        }
    }
    
}
