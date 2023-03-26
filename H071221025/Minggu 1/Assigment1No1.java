import java.util.Scanner;

public class Assigment1No1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("NIM : ");
        String inputNIM = inp.nextLine();
        int inputNIMint = Integer.parseInt(inputNIM.substring(inputNIM.length() - 3));
        int number = inputNIMint % 7;
        System.out.println(number == 0 ? "Soal: no 7" : "Soal : no " + number);
        inp.close();
    }
}
