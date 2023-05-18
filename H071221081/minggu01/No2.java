
import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        try {

            int typeDouble = 0;
            int typeInt = 0;
            Scanner sc = new Scanner(System.in);

            int len = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            // * mengubah string menjadi array dengan memisahkan nilai menggunakan spasi
            String strLst[] = str.split(" ");
            sc.close();

            // * cek panjang array
            if (strLst.length != len) {
                return;
            }

            for (int i = 0; i < strLst.length; i++) {
                // * mengecek apakah value memiliki tanda .
                if (strLst[i].contains(".")) {
                    typeDouble += 1;
                } else {
                    typeInt += 1;
                }
            }

            System.out.println(typeDouble + " bilangan desimal");
            System.out.println(typeInt + " bilangan bulat");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
