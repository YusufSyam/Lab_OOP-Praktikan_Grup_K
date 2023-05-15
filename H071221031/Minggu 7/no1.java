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
}

class Fighter extends Character {
    protected int attackPower;

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
    int attack() {
        return attackPower;
    }

    @Override
    int attack(String attackType) {
        if (attackType.equals("frost")) {
            return attackPower * 2;
        } else if (attackType.equals("fire")) {
            return attackPower *3;
        } else {
            return 0;
        }
    }
}

class Damage {
    public static void main(String[] args) {
        Character[] characters = new Character[5];
        characters[0] = new Fighter("Balmond", 20);
        characters[1] = new Mage("Kagura", 15);
        characters[2] = new Fighter("Alpha", 17);
        characters[3] = new Fighter("Lapu-lapu", 25);
        characters[4] = new Mage("Mathilda", 30);

        for (Character i : characters) {
            printAttack(i);
        }
    }

    public static void printAttack(Character character) {
        System.out.println("=".repeat(40));
        System.out.println(character.getName() + " - " + character.getName());
        System.out.println("Normal Attack : " + character.attack());
        if (character instanceof Fighter) {
            System.out.println("Melee         : " + character.attack("melee"));
            System.out.println("Ranged        : " + character.attack("ranged"));
        } else if (character instanceof Mage) {
            System.out.println("Fire          : " + character.attack("fire"));
            System.out.println("Frost         : " + character.attack("frost"));
        }
    }
}