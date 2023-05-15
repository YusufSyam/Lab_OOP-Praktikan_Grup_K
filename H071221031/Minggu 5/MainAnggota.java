public class MainAnggota {
    public static void main(String[] args) {
        PengurusInti pengurusInti = new PengurusInti("Aan", 19, "Laki", "Ketua");
        System.out.println("Name : " +pengurusInti.getName());
        System.out.println("Age : " +pengurusInti.getAge());
        System.out.println("Gender : " +pengurusInti.getGender());
        System.out.println("Jabatan : " +pengurusInti.getJabatan());


        KordinatorBidangStaff koordinasiBidangStaff = new KordinatorBidangStaff("Mina", 24," Perempuan", "Sarana Prasarana");
        System.out.println("Name : " +koordinasiBidangStaff.getName());
        System.out.println("Age : " +koordinasiBidangStaff.getAge());
        System.out.println("Gender : " +koordinasiBidangStaff.getGender());
        System.out.println("Bidang : " +koordinasiBidangStaff.getBidang());
    }
}
