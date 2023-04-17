public class Main {
    public static void main(String[] args) {
        PengurusInti pengurusInti = new PengurusInti();
        pengurusInti.setNama("Ilhamda");
        pengurusInti.setUmur(19);
        pengurusInti.setJabatan("Ketua Panitia");
        pengurusInti.tampilkanInfo();
        pengurusInti.berbicara();
        pengurusInti.mengaturRapat();

        KoordinatorBidang koordinatorBidang = new KoordinatorBidang();
        koordinatorBidang.setNama("Salwan");
        koordinatorBidang.setUmur(19);
        koordinatorBidang.setJabatan("Sekertaris");
        koordinatorBidang.tampilkanInfo();
        koordinatorBidang.berbicara();
        koordinatorBidang.mengaturTugas();

        Staf staf = new Staf();
        staf.setNama("Rama");
        staf.setUmur(19);
        staf.setJabatan("KorPubDok");
        staf.tampilkanInfo();
        staf.melaksanakanTugas();
    }
}