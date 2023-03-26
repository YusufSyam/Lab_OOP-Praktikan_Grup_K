import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan Judul Film: ");
        String inputString = inp.nextLine();
        String outputString = kapitalKata(inputString);
        System.out.println(outputString);
        inp.close();
    }
    
    public static String kapitalKata(String inputString) {
        String[] kata = inputString.split(" ");
        for (int i = 0; i < kata.length; i++) {
            if (kata[i].length() > 1) {
                String kapital = kata[i].substring(0, 1).toUpperCase();
                String tidakKapital = kata[i].substring(1).toLowerCase();
                tidakKapital = tidakKapital.replaceAll("[A-Z]", "a");
                kata[i] = kapital + tidakKapital;
            } else {
                kata[i] = kata[i].toUpperCase();
            }
        }
        
        String outputString = String.join(" ", kata);
        
        return outputString;
    }
}