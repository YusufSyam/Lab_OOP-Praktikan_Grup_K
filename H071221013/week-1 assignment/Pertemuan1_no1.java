import java.util.Scanner;
public class Pertemuan1_no1 {
    public static void main(String[] args) { 
        Scanner scan = new Scanner (System.in);
        String nim=scan.next();
        int sinp = Integer.parseInt(nim.substring(7, 10)); 
        if (sinp%7==0){
            sinp=7;
        } else {
            sinp=sinp%7;
        }
            scan.close();
            System.out.println("no" + sinp);
    }
}

