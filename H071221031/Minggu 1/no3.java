import java.util.Scanner;
public class no3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        try{
            System.out.println("Name : ");
            String name = scanner.nextLine();
            // buat inputan nama

            System.out.println("Umur : ");
            int umur = scanner.nextInt();
            scanner.nextLine();
            // buat inputan umur

            System.out.println("Hobby : ");
            String Hobby = scanner.nextLine();
            // buat inputan umur

            System.out.println("Nama Saya " + name + "," + umur + "Tahun, " + "Hobby " + Hobby);
        } catch (Exception e ) {
            System.out.println(" Umur Harus Angka") ;
        } 
        
        
}
}
