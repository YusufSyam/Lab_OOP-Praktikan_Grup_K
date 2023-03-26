import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
    try{
        Scanner inp = new Scanner(System.in);
        System.out.print("Nama   : ");
        String name = inp.nextLine();
        System.out.print("Umur   : ");
        int age = inp.nextInt();
        inp.nextLine();
        System.out.print("Hobby  : ");
        String hobby = inp.nextLine();

        System.out.println("Nama saya " + name + ", " + age + " tahun, hobby " + hobby);
        inp.close();
        
    } catch (Exception e) {
        System.out.println("Inputan haruslah berupa angka");
        }
    }
}
