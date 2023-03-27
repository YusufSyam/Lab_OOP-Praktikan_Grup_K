import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        try{
            System.out.print("Name : ");
            String name = userInput.nextLine();

            System.out.print("Umur : ");
            int age = userInput.nextInt();
            userInput.nextLine();

            System.out.print("Hobby : ");
            String hobby = userInput.nextLine();

            System.out.printf("Nama saya %s, %d tahun, hobby %s", name, age, hobby);
        } catch (Exception e) {
            System.out.println("Umur harus berupa angka!");
        }
    }
}
