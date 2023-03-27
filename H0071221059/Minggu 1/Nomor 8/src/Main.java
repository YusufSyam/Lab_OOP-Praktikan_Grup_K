import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3},
                {4, 5, 6},
                {7,8,9}};
        Scanner input = new Scanner(System.in);
        int searchNum;
        boolean found = false;
        try{
            System.out.print("Masukkan angka yang ingin dicari: ");
            searchNum = input.nextInt();

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i][j]==searchNum){
                        System.out.printf("found %d at [%d][%d]\n", searchNum, i, j);
                        found = true;
                        break;
                    }
                }
                if(found){
                    break;
                }
            }
            if(!found) {
                System.out.printf("%d tidak ditemukan dalam array.\n", searchNum);
            }
        } catch (Exception e) {
            System.out.println("Input harus berupa bilangan bulat.");
        }
    }
}