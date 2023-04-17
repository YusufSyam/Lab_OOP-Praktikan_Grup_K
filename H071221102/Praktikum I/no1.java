import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nim : ");
        String nim = sc.nextLine();
        System.out.println("Soal : No. ");
        int number = Integer.parseInt(nim.substring(nim.length()-3));

        if (number%7 == 0) {
            System.out.println(7);

        } else{
            System.out.println(number%7);

        sc.close();
        }
        

}
}

    

