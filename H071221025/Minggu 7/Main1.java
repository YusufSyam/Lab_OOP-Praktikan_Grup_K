public class Main1 {
    public static void main(String[] args) {
        Character[] characters = new Character[5];
        characters[0] = new Fighter("Mutia", 2);
        characters[1] = new Mage("Lia", 5);
        characters[2] = new Fighter("Cipa", 10);
        characters[3] = new Fighter("Nata", 22);
        characters[4] = new Mage("Karin", 3);

        for (Character character : characters) {
            //melakukan perulangan melalui array characters dan memanggil method printAttack pada setiap karakter dalam array.
            printAttack(character);
        }
    }

    public static void printAttack(Character character) {
        int meleeAttack = character.attack("melee");
        int rangedAttack = character.attack("ranged");
        System.out.printf("%s dengan attack power %d (melee) dan %d (ranged)\n", character.getName(), meleeAttack, rangedAttack);
        
        int frostAttack = character.attack("frost");
        int fireAttack = character.attack("fire");
        System.out.printf("%s dengan attack power %d (frost) dan %d (fire)\n", character.getName(), frostAttack, fireAttack);
        System.out.println("=".repeat(50));
    }
}    
