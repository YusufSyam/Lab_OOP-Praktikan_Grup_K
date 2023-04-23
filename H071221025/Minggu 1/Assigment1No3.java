import java.util.Scanner;

public class Assigment1No3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        try {
            System.out.print("Name: ");
            String name = inp.nextLine();
            
            System.out.print("Umur: ");
            int age = inp.nextInt();
            inp.nextLine();

            System.out.print("Hobby: ");
            String hobby = inp.nextLine();
            
            System.out.println("Nama saya " + name + ", " + age + " tahun, hobby " + hobby + ".");
        } catch (Exception e) {
            System.out.println("Umur harus berupa angka!");
        }
        inp.close();
    }
}
