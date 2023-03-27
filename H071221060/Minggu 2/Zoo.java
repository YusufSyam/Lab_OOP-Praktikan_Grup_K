public class Zoo {
    int jumlahHewan;
    int dilepaskan;

    void beliHewan (int jumlah) {
        jumlahHewan += jumlah;
    }
    
    void lepas (int lepas) {
        dilepaskan += lepas;
        jumlahHewan -= lepas;
    }
    void infoHewan (){
        System.out.println("Jumlah hewan saat ini di kebun binatang = " + jumlahHewan);
        System.out.println("Jumlah hewan yang dilepaskan saat ini adalah = " + dilepaskan);
    }


    public static void main(String[] args) {
        Zoo zoo = new Zoo ();
        zoo.jumlahHewan = 100;
        zoo.dilepaskan = 0;
        zoo.infoHewan();
        zoo.beliHewan(10);
        zoo.lepas(5);
        zoo.infoHewan();
    }
}
