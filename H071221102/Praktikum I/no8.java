import java.util.Scanner;

public class no8 {
    public static void main(String[] args) {
        int[][] number = {{1, 2, 3}, {4, 5, 6}, {7,8,9}};
        Scanner input = new Scanner (System.in);
        int angka = input.nextInt();
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if (number[i][j] == angka ) {
                    System.out.println("[" + i +"]"  + "[" + j + "]");
                    return;
                }
            }
        }
    }
}
