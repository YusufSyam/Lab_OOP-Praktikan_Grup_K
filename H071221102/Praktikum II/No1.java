public class No1 {
    
    public String name;
    public int jumlahGol;
    public int jumlahPertandingan;

    public No1(String name) {
        this.name = name;
    }

    public No1(String name, int jumlahGol, int jumlahPertandingan) {
        this.name = name;
        this.jumlahGol = jumlahGol;
        this.jumlahPertandingan = jumlahPertandingan;
    }


    String getName() {
        return this.name;
    }

    public void cr7() {
        this.jumlahGol = 824;
        this.jumlahPertandingan = 1149;
        System.out.println("Nama : " + name);
        System.out.println("Dengan gol " + jumlahGol);
        System.out.println("Sebanyak " + jumlahPertandingan + " kali main");
        System.out.println("Siiiiiiiuuuuuuuu");
    }

    public void josefBican() {
        this.jumlahGol = 805;
        this.jumlahPertandingan = 530;
        System.out.println("Nama : " + name);
        System.out.println("Dengan gol " + jumlahGol);
        System.out.println("Sebanyak " + jumlahPertandingan + " kali main");
    }

    public void lionelMessi() {
        this.jumlahGol = 796;
        this.jumlahPertandingan = 1010;
        System.out.println("Nama : " + name);
        System.out.println("Dengan gol " + jumlahGol);
        System.out.println("Sebanyak " + jumlahPertandingan + " kali main");
    }
}

class Pemain {
    public static void main(String[] args) {
        No1 pemain = new No1("Lionel Messi");

        if (pemain.getName () == "Cristiano Ronaldo") {
            pemain.cr7();
        }
        else if (pemain.getName() == "Josef Bican") {
            pemain.josefBican();
        }
        else if (pemain.getName() == "Lionel Messi") {
            pemain.lionelMessi();
            }
        }
}
