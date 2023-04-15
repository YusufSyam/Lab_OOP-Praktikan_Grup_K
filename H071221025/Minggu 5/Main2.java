public class Main2 {
    public static void main(String[] args) {
        // Membuat objek KoordinatorBidang
        KoordinatorBidang koordinator = new KoordinatorBidang("Syifa", 18, "Koordinator", "Konsumsi");

        // Mengakses atribut dan method milik KoordinatorBidang
        System.out.println("-".repeat(45));
        System.out.println(" ".repeat(12) +"~ KOORDINATOR ~" );
        System.out.println("-".repeat(45));
        System.out.println("Nama Koordinator: " + koordinator.getNama());
        System.out.println("Umur Koordinator: " + koordinator.getUmur());
        System.out.println("Jabatan Koordinator: " + koordinator.getJabatan());
        System.out.println("Bidang Koordinator: " + koordinator.getBidang());
        koordinator.menjalankanTugas();
        System.out.println("-".repeat(45));

        // Membuat objek PengurusInti
        PengurusInti pengurus = new PengurusInti("Lia", 18, "Ketua", "Pengurus kegiatan");

        // Mengakses atribut dan method milik PengurusInti
        System.out.println(" ".repeat(12) +"~ PENGURURUS INTI ~" );
        System.out.println("-".repeat(45));
        System.out.println("Nama Pengurus: " + pengurus.getNama());
        System.out.println("Umur Pengurus: " + pengurus.getUmur());
        System.out.println("Jabatan Pengurus: " + pengurus.getJabatan());
        System.out.println("Bidang Pengurus: " + pengurus.getPosisi());
        pengurus.menjalankanTugas();
        System.out.println("-".repeat(45));

        // Membuat objek Staf
        Staf staf = new Staf("Natalia", 19, "Administrasi","Staf");

        // Mengakses atribut dan method milik Staf
        System.out.println(" ".repeat(15) +"~ STAF~" );
        System.out.println("-".repeat(45));
        System.out.println("Nama Staf: " + staf.getNama());
        System.out.println("Umur Staf: " + staf.getUmur());
        System.out.println("Jabatan Staf: " + staf.getJabatan());
        System.out.println("Bidang Staf: " + staf.getTugas());
        staf.menjalankanTugas();
        System.out.println("-".repeat(45));
        
    }
}
