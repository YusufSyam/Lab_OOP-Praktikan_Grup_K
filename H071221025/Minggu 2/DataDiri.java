public class DataDiri {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.setJalan("Jl.Perintis Kemerdekaan 7");
        alamat.setKota("Makassar");

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setAlamat(alamat);
        mahasiswa.setNama("Qia");
        mahasiswa.setNim("H071221025");

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat().getAlamatLengkap());
    }
}

class Alamat {
    String jalan;
    String kota;

    String getAlamatLengkap() {
        return jalan + ", " + kota;
    }

    void setJalan(String jalanan) {
        jalan = jalanan;
    }

    void setKota(String kotaa) {
        kota = kotaa; 
    }
}

class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat;

    String getNama() {
        return nama;
    }
    void setNama(String name) {
        nama = name;
    }
    String getNim() {
        return nim;
    }
    void setNim(String nimku) {
        nim = nimku;
    }
    Alamat getAlamat() {
        return alamat;
    }
    void setAlamat(Alamat alamatku) {
        alamat = alamatku;
    }
}
