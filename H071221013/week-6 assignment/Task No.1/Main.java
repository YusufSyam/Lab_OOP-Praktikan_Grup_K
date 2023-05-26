public class Main {
    public static void main(String[] args) {
        Pitbull myDog = new Pitbull(3, 0);
        Alphard mobil = new Alphard(5, "Black", 140);
        Oppo hp = new Oppo(20000000, "Oppo");   

        System.out.println("=".repeat(53));
        System.out.println("Pitbull");
        myDog.move();
        myDog.describe();
        System.out.println("Posisi Awal Dog\t\t: 0");
        System.out.println("Bergeser ke Posisi\t: " + myDog.position);
        System.out.println("=".repeat(53)+ "\n");
        System.out.println("Brand\t\t\t: Alphard");
        mobil.move();
        System.out.println("=".repeat(53)+ "\n");
        hp.move();
        System.out.println("=".repeat(53));
    }
}