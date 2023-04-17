import java.util.Scanner;

public class No7 {
    static String[] buah = { "Anggur", "Apel", "Belimbing", "Durian", "Rambutan", "Pisang", "Jeruk", "Semangka",
            "Nanas",
            "Salak", "manggis" };

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan Kata Kunci: ");
        String inputBuah = inp.next();
        int indexBuah = findIndex(inputBuah);
        System.out.println(indexBuah);
        inp.close();
    }

    static int findIndex(String inputBuah) {
        // inputBuah = inputBuah.toLowerCase();
        int result = -1;
        for (int i = 0; i < buah.length; i++) {
            String buah1 = buah[i];
            // buah1 = buah1.toLowerCase();
            if (buah1.equals(inputBuah)) {
                result += i + 1;
            }
        }
        ;
        return result;
    }

}