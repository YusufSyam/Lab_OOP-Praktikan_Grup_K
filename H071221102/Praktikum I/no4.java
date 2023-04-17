import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kata = input.nextLine();
        input.close();

        perbaikiPenulisan(kata);                
    }

    public static void perbaikiPenulisan(String kata) {
        String[] arrayKata = kata.split(" ");

        for (int i = 0; i < arrayKata.length; i++) {
            String kataBaru = arrayKata[i].substring(0, 1).toUpperCase() + arrayKata[i].substring(1).toLowerCase();
            System.out.print(kataBaru + " ");
  }
}
}
    

