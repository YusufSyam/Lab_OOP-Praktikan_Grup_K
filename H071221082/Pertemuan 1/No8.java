import java.util.Scanner;

public class No8 {
    public static void main(String[] args) {
        int angka;
        try{
            int[][] nums = {{1,2,3}, {4,5,6}, {7,8,9}};
            Scanner inp = new Scanner(System.in);
            angka = inp.nextInt();
            boolean found = false;
            for (int i = 0; i < nums.length; i++){
                for (int j = 0; j < nums.length; j++){
                    if (nums[i][j] == angka) {
                        System.out.println("Found " + angka + " at " + "[" + i + "]" + "[" + j + "]");
                        found = true;
                        return;
                    }
                }
                inp.close(); 
            } 
            if (!found) throw new Exception("Inputan tidak ditemukan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}