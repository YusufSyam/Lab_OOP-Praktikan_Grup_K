class Alamat {
    String jalan,kota;
    
    String getAlamatLengkap() {
        return jalan + "," + kota;
    }
}
class Mahasiswa {
    String nama,nim; 
    Alamat alamat;

    String getNama() {
        return nama;
    }
    String getNim() {
        return nim;
    }
    Alamat getAlamat() {
        return alamat;
    }
}

public class MahasiswaMain {
    public static void main(String[] args) {
        Alamat alamat = new Alamat ();
        alamat.jalan = "Jalan Mustafa Dg. Bunga";
        alamat.kota = " Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Zulfikri";
        mahasiswa.nim = "H071221082";

        System.out.println("Nama   : " + mahasiswa.getNama());
        System.out.println("Nim    : " + mahasiswa.getNim());
        System.out.println("Alamat : " + mahasiswa.getAlamat().getAlamatLengkap());

    }
}


