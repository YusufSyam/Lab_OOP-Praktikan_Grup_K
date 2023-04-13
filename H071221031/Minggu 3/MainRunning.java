public class MainRunning {
    public static void main(String[] args) {
        Kecepatan kecepatan = new Kecepatan();
        

        Running running1 = new Running("Aan", 19);
        System.out.println(running1.getNama() + " usia " + running1.usia);
        running1.setKecepatan(10);
        running1.Info();

        Running running2 = new Running ("Naufal", 19);
        System.out.println(running2.getNama() + " usia " +running2.usia);
        running2.setKecepatan(12);
        running2.Info();
    }
}
