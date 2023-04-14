package ujian.utils;

public class HelperMid {
    static String nama = "Muhammad Ilham Syahfithrah Hendra";
    static String nim = "H071221081";
    static String kelas = "A";
    static String paket = "A";
    static String feedback = "sepertinya tidak ada jadi mungkin feedbacknya sama seperti semester lalu sekalian saya buat juga tambahan utils-nya";

    public static void showMyData() {
        System.out.println("Data Diri");
        System.out.println("nama : " + nama);
        System.out.println("nim : " + nim);
        System.out.println("kelas : " + kelas);
        System.out.println("paket : " + paket);
    }

    public static void showFeedbackLab() {
        System.out.println("-".repeat(25));
        System.out.println("Kritik dan Saran");
        System.out.println("-".repeat(25));
        HelperMid.cutLineString(feedback);
    }

    public static void cutLineString(String s) {
        String[] arrayString = s.split(" ");
        for (int i = 0; i < arrayString.length; i++) {
            // if((i+1) % 3 == 0){
            // System.out.printf("%s %s %s
            // \n",arrayString[i],arrayString[i+1],arrayString[i+2]);
            // }
            if (i % 3 == 0 & i != 0) {
                System.out.println();
            }
            System.out.print(arrayString[i] + " ");

        }
        System.out.println();
    }
}
