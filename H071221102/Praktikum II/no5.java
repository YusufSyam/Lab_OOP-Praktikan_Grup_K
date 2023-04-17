public class no5 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat ();
        alamat.jalan = "Goa Ria";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Fikry";
        mahasiswa.nim = "H071221102";

        System.out.println("Nama : " + mahasiswa.getNama());
        System.out.println("Nim : " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat().getAlamatLengkap());

    }
}

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

