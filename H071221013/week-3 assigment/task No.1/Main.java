public class Main {
    public static void main(String[] args){
        Hijab hijab1 = new Hijab("Rabani", "Voal Premium", 4, 300000);
        Hijab hijab2 = new Hijab("Dian Pelangi", "Katun Toyobo", 170000);

        System.out.println("==================================================");
        hijab1.detailHijab();
        System.out.println("Total Harga Keseluruhan     : " + hijab1.HargaHijab());
        System.out.println("==================================================");
        hijab2.detailHijab();
        System.out.println("Total Harga Keseluruhan     : " + hijab2.HargaHijab());
        System.out.println("==================================================");
    }
}