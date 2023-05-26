public class Main {
    public static void main(String[] args) {
        KetuaUmum ketua = new KetuaUmum("GembollLp", 20, "Male");
        Sekretaris sekre = new Sekretaris("Santi", 19, "Female");
        Bendahara bndhra = new Bendahara("Karina", 19, "Female");
        ketua.showKetuaUmum();
        sekre.showSekretaris();
        bndhra.showBendahara();
        System.out.println();

        HubunganMasyarakat humas = new HubunganMasyarakat("Aidil", 21, "Male");
        humas.showHubunganMasyarakat();
        System.out.println();

        Sarpras sarpras = new Sarpras("Candra Dewi", 20, "Female");
        sarpras.showSarpras();
        System.out.println();

        Kesekretariatan sekretariat = new Kesekretariatan("Ahmad Alim", 21, "Male");
        sekretariat.showKesekretariatan();
        System.out.println(); 
        
        Management mngmt = new Management("Andi Muh.Iqbal Shaff", 19, "Male");
        mngmt.showManagement();
        System.out.println();

        Penasehat penasehat = new Penasehat("Della indah", 19, "Female");
        penasehat.showPenasehat();
        System.out.println();

        Pelayanan pelayanan = new Pelayanan("Rajul bin Krisna", 24, "Male");
        pelayanan.showPelayanan();
        System.out.println();

    }

}