import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        try{ 
            Scanner inp = new Scanner(System.in);                          
            System.out.print("");
            int n = inp.nextInt();
            int desimal = 0;
            int bulat = 0;
            
            for (int i = 0; i < n; i++) {
                double num = inp.nextDouble();
                
                if (num % 1 == 0) {
                    bulat++;
                } else {
                    desimal++;
                }
            }
            
            System.out.println(bulat + " Bilangan Bulat");
            System.out.println(desimal + " Bilangan Desimal");
            inp.close();

        }catch (Exception e) {
            System.out.println("Hanya bisa menerima angka");
        }
    }
}

