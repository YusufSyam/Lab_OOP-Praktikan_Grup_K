public class KoordinatorBidang  extends SistemInformasi{

    public void tampilkanInfo(){
        System.out.println("\n" + "=".repeat(40));
        System.out.println("||" + " ".repeat(8) + "Koordinator Bidang " + " ".repeat(9) + "||");
        System.out.println("=".repeat(40));
        System.out.println("nama \t: " + getNama() + "\numur \t: " + getUmur() + " tahun" + "\njabatan : " + getJabatan());
    }

    public void mengaturTugas(){
        System.out.println("Silahkan mengerjakan tugasnya masing-masing.\n");
    }
}