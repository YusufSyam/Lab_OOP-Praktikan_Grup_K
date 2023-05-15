package No1;

abstract class Character {
    protected String name;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract int attack();
    abstract int attack(String attackType);

    public void printAttack(Character character) {
        System.out.println("Character: " + character.getName());
        System.out.println("Attack Power: " + character.attack());
        System.out.println();
    }
}

class Fighter extends Character {
    protected int attackPower;  //deklarasi attackPower

    public Fighter(String name, int attackPower) {  //menerima 2 parameter
        super(name);
        this.attackPower = attackPower;
    }

    @Override
    public int attack() {
        return attackPower;
    }

    public int attack(String attackType) {  //method attack
        if (attackType.equals("melee")) {  
            return attackPower * 2;
        } else if (attackType.equals("ranged")) {
            return attackPower;
        } else {
            return 0;
        }
    }
}

class Mage extends Character {
    protected int attackPower;

    public Mage(String name, int attackPower) {
        super(name);
        this.attackPower = attackPower;
    }

    @Override
    public int attack() {
        return attackPower;
    }

    @Override
    public int attack(String attackType) {
        if (attackType.equals("Fire")) {
            return attackPower * 3;
        } else if (attackType.equals("Frost")) {
            return attackPower * 2;
        } else {
            return 0;
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        Character[] karakter = new Character[5];
        karakter[0] = new Fighter("Granger", 10);
        karakter[1] = new Mage("Kimmy", 13);
        karakter[2] = new Fighter("Irithel", 5);
        karakter[3] = new Fighter("Karrie", 12);
        karakter[4] = new Mage("X.Borg", 30);

        for (Character karakters : karakter) { //mengiterasi
            printAttack(karakters);
        }
    }

    public static void printAttack(Character karakter) {
        System.out.println("=".repeat(44));
        int melee = karakter.attack("melee");
        System.out.println(karakter.getName() + "\t: " + " Attack " + karakter.attack() + " attack power " + " melee " + melee);
        int frost = karakter.attack("frost");
        System.out.println(karakter.getName() + "\t: " + " Attack " + karakter.attack() + " attack power " + " frost " + frost + "\n");
        // cetak informasi /karakter setiap elemen
    }
}