abstract class Character {
    public String name;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract int attack();

    abstract int attack(String attackType);
}

class Fighter extends Character {
    private int attackPower;

    public Fighter(String name, int attackPower) {
        super(name);
        this.attackPower = attackPower;
    }

    @Override
    int attack() {
        return attackPower;
    }

    @Override
    int attack(String attackType) {
        if (attackType.toLowerCase().equals("melee")) {
            return attackPower * 2;
        } else if (attackType.toLowerCase().equals("ranged")) {
            return attackPower;
        }
        return attackPower;
    }
}

class Mage extends Character {
    private int attackPower;

    public Mage(String name, int attackPower) {
        super(name);
        this.attackPower = attackPower;
    }
    
    @Override
    int attack() {
        return attackPower;    
    }

    @Override
    int attack(String attackType) {
        if (attackType.toLowerCase().equals("frost")) {
            return attackPower * 2;
        } else if (attackType.toLowerCase().equals("fire")) {
            return attackPower * 3;
        }
        return attackPower;
    }
}

public class Game {
    public static void main(String[] args) {
        Character[] characters = new Character[5];
        characters[0] = new Fighter("John Wick", 300);
        characters[1] = new Mage("Dr. Strange", 600);
        characters[2] = new Fighter("Nobody", 250);
        characters[3] = new Fighter("Ip Man", 270);
        characters[4] = new Mage("Scarlet Witch", 450);

        for (int i = 0; i < characters.length; i++) {
            printAttack(characters[i]);
        }
    }

    static void printAttack(Character character) {
        System.out.println("=================================================================");
        System.out.println(character.getName() + " dengan " + character.getClass() + " mempunyai attack power sebesar " + character.attack("melee"));
    }
}