class Alamat{
    String jalan ;
    String kota ;
    String getAlamatLengkap(){
        return jalan + ", " + kota ;
    }
}

class Mahasiswa{
    Alamat alamat ;
    String nama;
    String nim;

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

public class no5 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Kompleks Skarda N no.11";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Aan Syawaluddin Adi Putra";
        mahasiswa.nim = "H071221031";

        System.out.println("Nama : " + mahasiswa.getNama());
        System.out.println("NIM : " + mahasiswa.getNim());
        System.out.println("Alamat : " + mahasiswa.getAlamat().getAlamatLengkap());
    }
}
