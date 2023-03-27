public class Main1 {
    public static void main(String[] args) {
        // membuat objek ban depan dan belakang
        Ban banDepan = new Ban("Swallow", 28);
        Ban banBelakang = new Ban("Swallow", 26);

        // membuat objek sepeda dengan ban depan dan belakang
        Sepeda sepeda = new Sepeda(2, 0, 2500000, banDepan, banBelakang);

        // memanggil metode pada objek sepeda
        sepeda.tambahKecepatan(10);
        sepeda.info();
    }
}
 