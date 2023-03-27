import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
            try {
                System.out.print("Name : ");
                String a = inp.nextLine();       
                System.out.print("Umur : ");
                int b = inp.nextInt();
                inp.nextLine();
                System.out.print("Hobby : ");
                String c = inp.nextLine();
                System.out.println("Nama Saya " + a + ", " + b + " Tahun, " + "Hobby " + c );
            } catch (Exception e) {
                System.out.println("inputan umur harus berupa angka");
            }
        inp.close();
    }
    
}
