import java.util.Scanner; 
public class Pertemuan1_no3 {
       public static void main(String[] args){
        Scanner n = new Scanner(System.in);
    
        String Name;
        int Umur;
        String Hobby;

        try{
            System.out.print("Name: ");
            Name = n.nextLine(); 
            
            System.out.print("Umur: ");
            Umur = n.nextInt();
            n.nextLine();

            System.out.print("Hobby: ");
            Hobby = n.nextLine(); 
            
            System.out.println();
            System.out.println("Nama saya " + Name +", " + Umur + " tahun, "+ "hobby " + Hobby);
        } catch (Exception e) {
            System.out.println("Umur harus berupa angka");
        }
        n.close();
        
    }
}


