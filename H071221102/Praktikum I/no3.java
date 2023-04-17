import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner (System.in);
            System.out.print("Name : ");
            String name = sc.nextLine();
            System.out.print("Age : ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Hobby : ");
            String hobby = sc.nextLine();

            System.out.println("Nama saya " + name + ", " + age + " Tahun, " + "hobby " + hobby);
        } catch(Exception e) {
            System.out.println("Umur harus angka");
        }
    }
}
