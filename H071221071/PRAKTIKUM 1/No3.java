import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama : ");
        String nama = scanner.nextLine();

        System.out.print("Umur : ");
        String umurString = scanner.nextLine();

        System.out.print("Hobby : ");
        String hobby = scanner.nextLine();

        try {
            int umur = Integer.parseInt(umurString);
            System.out.printf("Nama saya %s, %d tahun, Hobby %s%n", nama, umur, hobby);
        } catch (NumberFormatException e) {
            System.out.println("Maaf, umur harus berupa angka.");
        }
        scanner.close();
    }
}
