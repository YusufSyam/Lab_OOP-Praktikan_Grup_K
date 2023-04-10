class Valorant{
    String nama;
    int jumlahArmor;
    String roll,elemen;
    Skill skill;


//behaviour
    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getElemen() {
        return elemen;
    }

    public void setElemen(String elemen) {
        this.elemen = elemen;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

//constructor
    public Valorant(String nama){
    this.nama = nama;

    System.out.println("Ke constructor 1");
    }
    
    public Valorant(int jumlahArmor){
    this.jumlahArmor = jumlahArmor;
    System.out.println("Ke constructor 2");
    }
    
}
class Skill{
    String power1;
    String power2;

    public String getFullSkill(){
        return power1 + "," + power2;
    }
}

public class No1{
    public static void main(String[] args) {
        Skill skill = new Skill();
        skill.power1 = "Dark cover ";
        skill.power2 = "From the Shadows";

        Valorant valo = new Valorant("Omen");
        valo.skill = skill;
        valo.jumlahArmor = 1000;
        valo.roll = "Controller";
        valo.elemen = "darkness";

        System.out.println("Nama karakter : " + valo.nama);
        System.out.println("Jumlah armor: " + valo.jumlahArmor);
        System.out.println("Roll : " + valo.getRoll());
        System.out.println("Elemen : " + valo.getElemen());
        System.out.println("Skill : " +valo.getSkill().getFullSkill());
    }   
}
