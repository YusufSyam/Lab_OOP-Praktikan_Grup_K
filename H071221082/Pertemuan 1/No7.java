import java.util.Scanner;

public class No7 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String x = inp.nextLine();
        int num = findIndex(x);
        System.out.println(num);

        inp.close();
    }    
    public static int findIndex(String teks) {
        String negara[] = {"Amerika", "Inggris", "Polandia", "Indonesia", "Laos"};
        for (int i = 0; i < negara.length; i+= 1){
            if (negara[i].equalsIgnoreCase(teks)){
                return i;
            }
        }
        return -1;
    }
}