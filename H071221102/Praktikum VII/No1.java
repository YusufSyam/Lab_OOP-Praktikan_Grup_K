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
            return attackPower*2;
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
    int attack () {
        return attackPower;
    }

    @Override
    int attack(String attackType) {
        if (attackType.toLowerCase().equals("frost")) {
            return attackPower * 2;
        } else if (attackType.toLowerCase().equals("fire")) {
            return attackPower*3;
        }
        return attackPower;
    }
}

public class No1 {
    public static void main(String[] args) {
        Character [] karakter = new Character[5];
        karakter [0] = new Fighter("Zilong", 150);
        karakter [1] = new Mage("Cyclops", 125);
        karakter [2] = new Fighter("Martis", 300);
        karakter [3] = new Fighter("Lancelot", 250);
        karakter [4] = new Mage("Lesley", 225);

        for (int i = 0; i < karakter.length; i++) {
            printAttack(karakter[i]);
        }
    }

    static void printAttack(Character karakter) {
        System.out.println("=========================================");
        System.out.println("nama    : " + karakter.getName());
        System.out.println("Class   : " + karakter.getClass());
        System.out.println("Power   : " + karakter.attack("fire"));
    }
}