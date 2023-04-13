public class Anggota {
    private String name;
    private int age;
    private String gender;

    public Anggota (String name, int age, String gender){
        this.name = name ;
        this.age = age;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

class PengurusInti extends Anggota{
    private String jabatan;

    public PengurusInti(String name, int age, String gender, String jabatan){
        super(name, age, gender);
        this.jabatan = jabatan;
    }
    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}

class KordinatorBidangStaff extends Anggota{
    private String bidang;

    public KordinatorBidangStaff(String name, int age, String gender, String bidang){
        super(name, age, gender);
        this.bidang = bidang;
    }
    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }
}


