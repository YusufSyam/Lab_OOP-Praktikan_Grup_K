
import java.util.Scanner;

public class No8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("cari angka : ");
        int wantedNumber = sc.nextInt();
        sc.close();
        int lst[][] = {{1,2,3},{4,5,6},{7,8,9},{0}};


        for (int i = 0; i < lst.length; i++) {
            for (int j = 0; j < lst[i].length; j++) {
                if(lst[i][j] == wantedNumber){
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
        System.out.println("angka yang anda cari tidak ada");
    }
}
