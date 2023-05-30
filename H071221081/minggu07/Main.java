/**
 * Main
 */


public class Main {

    public static void main(String[] args) {
        Fighter p1 = new Fighter("playerI", 30);
        Mage p2 = new Mage("playerII", 40);
        Fighter p3 = new Fighter("playerIII", 20);
        Fighter p4 = new Fighter("playerIV", 25);
        Mage p5 = new Mage("playerV", 35);

        Character[] players = {p1, p2, p3, p4, p5};

        printAttack(players);
    }

    public static void printAttack(Character[] players){
        for (Character player : players) {
            int x= player.attack();
            System.out.println(x);
        }
        // player.attack();
    }
}