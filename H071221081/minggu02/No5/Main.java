
public class Main {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalanrea Indah";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "ikshan";
        mahasiswa.nim = "H071191049";

        System.out.println(mahasiswa.getNama());
        System.out.println(mahasiswa.getNim());
        System.out.println(mahasiswa.getAlamat().getAlamatLengkap());

    }
}

class Mahasiswa{
    String nama,nim;
    Alamat alamat;

    String getNama(){
        return nama;
    }

    String getNim(){
        return nim;
    }

    Alamat getAlamat(){
        return alamat;
    }
    
}

class Alamat{
    String jalan,kota;

    String getAlamatLengkap(){
        return kota + ", " + jalan;
    }

}
