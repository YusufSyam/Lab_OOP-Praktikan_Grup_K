public class Main {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Sahabat Raya";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Susanti";
        mahasiswa.nim = "H071221013";

        System.out.println("Nama    : " + mahasiswa.getNama());
        System.out.println("NIM     : " + mahasiswa.getNim());
        System.out.println("Alamat  : " + mahasiswa.getAlamat().getAlamatLengkap());
    }
}