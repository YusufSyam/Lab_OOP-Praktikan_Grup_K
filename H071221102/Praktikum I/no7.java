import java.util.Scanner;

public class no7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String animal = input.nextLine();
        int tempat = findIndex(animal);
        System.out.println(tempat);

        
    }
    public static int findIndex(String teks) {
        String binatang[] = {"kucing", "Ayam", "Kuda", "Sapi", "Singa"};
        for (int i = 0; i < binatang.length; i+=1) {
            if (binatang[i].equalsIgnoreCase(teks)) {
                return i ;
                
            }
        }
        return -1;
    }
}
