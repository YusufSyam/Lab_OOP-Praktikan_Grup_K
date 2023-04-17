public class PengurusInti extends SistemInformasi{

    public void tampilkanInfo(){
        System.out.println("\n" + "=".repeat(40));
        System.out.println("||" + " ".repeat(10) + "Pengurus  Inti " + " ".repeat(11) + "||");
        System.out.println("=".repeat(40));
        System.out.println("nama \t: " + getNama() + "\numur \t: " + getUmur() + " tahun" + "\njabatan : " + getJabatan());
    }
    public void mengaturRapat(){
        System.out.printf("saya %s sebagai %s saya akan memandu jalannya presentasi kali ini.\n", super.getNama(), super.getJabatan());

    }
}